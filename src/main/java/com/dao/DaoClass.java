package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.enity.Student;

public class DaoClass {
	private Connection conn;

	public DaoClass(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean getData(Student student) {
		boolean f=false;
		
		String sql="insert into crud_db.stud_dtls(name,email,phone,city,password)values(?,?,?,?,?)";
		
		try {
			PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, student.getName());
		pst.setString(2, student.getEmail());
		pst.setString(3, student.getPhone());
		pst.setString(4, student.getCity());
		pst.setString(5, student.getPassword());
		int i=pst.executeUpdate();
		
		if(i==1) {
			return true;
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	
	
	
	
	
	public List<Student> lst(){
		List<Student> list=new ArrayList<Student>();
		String sql2="select *from crud_db.stud_dtls";
		Student uu=null;
		try {
		PreparedStatement pt=conn.prepareStatement(sql2);
		ResultSet rr=pt.executeQuery();
			
			while(rr.next()) {
				uu=new Student();
				uu.setId(rr.getInt(1));
				uu.setName(rr.getString(2));
				uu.setEmail(rr.getString(3));
				uu.setPhone(rr.getString(4));
				uu.setCity(rr.getString(5));
				uu.setPassword(rr.getString(6));
				
				list.add(uu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	
}
	
	
	public Student getByID(int id) {
		
		List<Student> list=new ArrayList<Student>();
		String sql2="select *from crud_db.stud_dtls where id=?";
		Student uu=null;
		try {
		PreparedStatement pt=conn.prepareStatement(sql2);
		pt.setInt(1, id);
		ResultSet rr=pt.executeQuery();
		
			
			while(rr.next()) {
				uu=new Student();
				uu.setId(rr.getInt(1));
				uu.setName(rr.getString(2));
				uu.setEmail(rr.getString(3));
				uu.setPhone(rr.getString(4));
				uu.setCity(rr.getString(5));
				uu.setPassword(rr.getString(6));
				
				list.add(uu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return uu;
	}
	
	
	
	
	public boolean updateData(Student student) {
		boolean f=false;
		
		String sql="update crud_db.stud_dtls set name=?,email=?,phone=?,city=? where id=? ";
		
		try {
			PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, student.getName());
		pst.setString(2, student.getEmail());
		pst.setString(3, student.getPhone());
		pst.setString(4, student.getCity());
		pst.setInt(5, student.getId());
		
		
		int i=pst.executeUpdate();
		
		if(i==1) {
			return true;
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	
	public boolean deleteByID(int id) throws SQLException {
		boolean f= false;
		
		String sql="delete from crud_db.stud_dtls where id=?";
		
		PreparedStatement pt =conn.prepareStatement(sql);
		pt.setInt(1, id);
		int i=pt.executeUpdate();
		
		if(i==1) {
			return f=true;
		}
		return f;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
