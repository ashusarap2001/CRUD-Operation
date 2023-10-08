package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.connection_db.Conn;
import com.dao.DaoClass;


@WebServlet("/delete")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Deleteservlet() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int i=Integer.parseInt(request.getParameter("id"))  ;
		
		try {
			DaoClass dd= new DaoClass(Conn.getConnection());
			boolean f=dd.deleteByID(i);
			if(f) {
				System.out.print(f);
				response.sendRedirect("allStud.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
