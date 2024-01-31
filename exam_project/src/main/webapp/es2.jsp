<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.bean.LibroBean"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
		<h2>Pagina dell'esercizio 2</h2>
		<%
		List<LibroBean> libri = (List<LibroBean>) request.getAttribute("risultato");
		%>
		<table  class="table">
			<tr>
				<th scope="col">Titolo</th>
				<th scope="col">Autore</th>
				<th scope="col">Pegi</th>
				<th scope="col">Descrizione</th>
				<th scope="col">Prezzo</th>
				<th scope="col">Tot disponibili</th>
				<th scope="col">Data pubblicazione</th>
			</tr>
			
				<%
				for (LibroBean libro : libri) {
				%>
				<tr>
				<td>
					<%=libro.getTitolo()%>
				</td>
				<td>
					<%=libro.getAutore()%>
				</td>
				<td>
					<%=libro.getIdPegi()%>
				</td>
				<td>
					<%=libro.getDescrizione()%>
				</td>
				<td>
					<%=libro.getPrezzo() %>
				</td>
				<td>
					<%=libro.getTotDisponibili() %>
				</td>
				<td>
					<%=libro.getDataPubblicazione() %>
				</td>
				</tr>
				<%}%>
			
		</table>



	</div>
</body>
</html>