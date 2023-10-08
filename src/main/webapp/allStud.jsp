<%@page import="com.enity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.connection_db.Conn"%>
<%@page import="com.dao.DaoClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>



<!--  Nav Bar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Student Management</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="registration.jsp">Add Student</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home Page</a>
        </li>
      
      </ul>
     
    </div>
  </div>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!--  Nav Bar End-->


	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">First</th>
				<th scope="col">email</th>
				<th scope="col">Phone</th>
				<th scope="col">City</th>
				<th scope="col">Action</th>



			</tr>
		</thead>
		<tbody>
			<%
			DaoClass dd = new DaoClass(Conn.getConnection());
			List<Student> uu = dd.lst();

			for (Student u : uu) {
			%>


			<tr>
				<th scope="row"><%=u.getId()%></th>
				<td><%=u.getName()%></td>
				<td><%=u.getEmail()%></td>
				<td><%=u.getPhone()%></td>
				<td><%=u.getCity()%></td>
				
				<td>
		 <a href="update.jsp?id=<%=u.getId()%>">
		 <button type="button" class="btn btn-primary">Edit </button>
		 </a>
		  <a href="delete?id=<%=u.getId()%>">
		 <button type="button" class="btn btn-danger">Delete </button>
		 </a>
		 </td> 
			</tr>
			<%
			}
			%>



		</tbody>
	</table>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>