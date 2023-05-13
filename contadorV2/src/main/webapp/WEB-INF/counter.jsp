<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contador mas 1</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container p-3">
		<p> Has visitado esta pagina <c:out value= "${count }" /> veces <p>
		<ul class="list-group">
		  <li class="list-group-item"><a href="/"> Hacer otra visita</a></li>
		  <li class="list-group-item"><a href="/reset"> Empezar de nuevo</a></li>
		  <li class="list-group-item"><a href="/counter2">  Contar +2</a></li>
		</ul>
	</div>

</body>
</html>