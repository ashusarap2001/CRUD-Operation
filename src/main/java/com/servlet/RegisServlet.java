package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.connection_db.Conn;
import com.dao.DaoClass;
import com.enity.Student;

@WebServlet("/add")
public class RegisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		// Get all data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String pass = request.getParameter("password");

		// Save USer;

		Student ss = new Student(name, email, phone, city, pass);
		DaoClass dd;
		try {
			dd = new DaoClass(Conn.getConnection());

			boolean f = dd.getData(ss);
			if (f) {
				System.out.print("UU");
				response.sendRedirect("allStud.jsp");
			} else {
				System.out.print("FF");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
