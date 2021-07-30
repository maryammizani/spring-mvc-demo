<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <!DOCTYPE html>
<head>
	<title>Student Reg Form</title>
</head>

<html>
	<body>
		<form:form action="processForm4" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name: <form:input path="lastName" />
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>		
	</body>
</html>