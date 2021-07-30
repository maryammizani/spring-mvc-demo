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
			Country: 
			<!--  <form:select path="country">
				<form:option value="Brazil" label="Brazil" />
				<form:option value="France" label="France" />
				<form:option value="Germany" label="Germany" />
				<form:option value="India" label="India" />
			</form:select>  -->
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>		
	</body>
</html>