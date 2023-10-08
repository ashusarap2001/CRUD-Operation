package com.enity;

public class Student {

	private int id;
	private String name;
	private String email;
	private String phone;
	private String city;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", password=" + password + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String email, String phone, String city, String password) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.password = password;
	}
	
	public Student(int id,String name, String email, String phone, String city) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		
	}
	
	
}

