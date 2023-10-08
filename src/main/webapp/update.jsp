<!DOCTYPE html>
<%@page import="com.enity.Student"%>
<%@page import="com.connection_db.Conn"%>
<%@page import="com.dao.DaoClass"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Update </title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
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
       <!--  <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="registration.jsp">Add Student</a>
        </li> -->
        <li class="nav-item">
          <a class="nav-link" href="allStud.jsp">All Students</a>
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

<%
int id = Integer.parseInt(request.getParameter("id"));
DaoClass dd = new DaoClass(Conn.getConnection());
Student ss =dd.getByID(id);
%>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Update page</h2>

						<form action="updateUser" class="register-form" id="register-form" method="post">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" value="<%=ss.getName() %>"/>
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" value="<%=ss.getEmail()%>"/>
							</div>
							<div class="form-group">
								<label for="Phone"><i class="zmdi zmdi-email"></i></label> <input
									type="text" name="phone" id="email" placeholder="Your phone" value="<%=ss.getPhone() %>" />
							</div>
							<div class="form-group">
								<label for="City"><i class="zmdi zmdi-email"></i></label> <input
									type="text" name="city" id="email" placeholder="Your city" value="<%=ss.getCity()%>"/>
							</div>
							
							
							
							<div class="form-group">
								<label for="id"><i class="zmdi zmdi-email"></i></label>
								<input type="hidden" name="id"  value="<%=ss.getId()%>">
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div> 
							
						</form>
					</div>

				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>