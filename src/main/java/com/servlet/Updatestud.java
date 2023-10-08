package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.connection_db.Conn;
import com.dao.DaoClass;
import com.enity.Student;

@WebServlet("/updateUser")
public class Updatestud extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Updatestud() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		int id=Integer.parseInt(request.getParameter("id"));
		Student ss=new Student(id,name,email,phone,city);
		try {
			DaoClass dd= new DaoClass(Conn.getConnection());
			boolean f=dd.updateData(ss);
				
			
			//response.sendRedirect("/");
			if(f) {
			System.out.print("UU");
				
			}
			else {
				System.out.print("FF");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
