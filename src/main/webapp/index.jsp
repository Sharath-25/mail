<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body bgcolor="cyan">
	<marquee scrollamount="10">
		<h1>Welcome to X-workz</h1>
	</marquee>
	<div align="center">

		<form action="sendMail.do" method="post">
			<label>To</label><input type="email" name="receiverId"><br>
			<br> <label>Subject</label><input type="text" name="subject"><br>
			<br> <label>Body</label>
			<textarea rows="5" cols="50" name="body"></textarea>
			<br> <br> <input type="submit" value="send">
		</form>

	</div>
</body>
</html>