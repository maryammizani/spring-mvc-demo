<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <!DOCTYPE html>
<head>
	<title>Student Confirmation</title>
</head>

<html>
	<body>
		Student is confirmed: ${student.firstName} 	${student.lastName} 
		<br><br>
		Country:  ${student.country} 	
		<br><br>
		Favorite Language:  ${student.favoriteLanguage} 	
	</body>
</html>