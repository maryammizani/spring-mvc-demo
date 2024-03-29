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
			Favorite Language:
			<%-- 
			Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C# <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" /> 
			--%>
			<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
			<br><br>
			Operating systems:
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
			Windows <form:checkbox path="operatingSystems" value="Windows" />
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>		
	</body>
</html>