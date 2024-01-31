<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="model.bean.LibroBean"%>
<%@ page import="java.util.Map"%>
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
		<h2>Pagina dell'esercizio 3</h2>
		<%
		Map<Long, Integer> libriTrovati = (Map<Long, Integer>) request.getAttribute("risultato");
		%>
		<table class="table">
			<tr>
				<th scope="col">Libro Id</th>
				<th scope="col">Quantità</th>
				<th scope="col">Sta esaurendo</th>
			</tr>

			<%
			for (Map.Entry<Long, Integer> entry : libriTrovati.entrySet()) {
			%>
			<tr>


				<td><%=entry.getKey()%></td>
				<td><%=entry.getValue()%></td>
				<%
				if (entry.getValue() > 3) {
				%>
				<td>No</td>

				<%
				} else {
				%>
				<td>Si</td>
				<%
				}
				%>
			</tr>
			<%
			}
			%>

		</table>



	</div>
</body>
</html>