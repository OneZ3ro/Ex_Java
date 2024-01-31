<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="model.bean.UtenteBean"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>Scrivi l'autore</h2>
		<form action="SecondServlet" method="GET"
			novalidate>
			<div class="mb-3">
				<label class="form-label" for="Autore">Autore:</label> <input
					class="form-control" type="text" name="autore"
					placeholder="Inserisci l'autore">
			</div>
			<div class="d-flex justify-content-between">
				<button class="btn btn-success" type="submit">Invia</button>
				<a class="btn btn-primary" href="index.jsp">Home Page</a>
			</div>
		</form>
	</div>
</body>
</html>