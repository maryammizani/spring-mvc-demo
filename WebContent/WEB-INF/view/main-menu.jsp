<!DOCTYPE html>
<head>
	<link rel="stylesheet" type="text/css"          
	href="${pageContext.request.contextPath}/resources/css/common.css">
	<script src="${pageContext.request.contextPath}/resources/js/common.js"></script>
</head>

<html>
	<body>
		<h2>Spring MVC Demo - Home Page</h2>
		<hr>
		<a href="hello/showForm">HelloWorldForm</a>
		<br><br>
		<a href="student/showForm">Student Form</a>
		<br><br>
		<a href="customer/showForm">Customer Form</a>
		<br><br>
		<img src="${pageContext.request.contextPath}/resources/images/pic.jpg" class="pic">
	</body>
</html>