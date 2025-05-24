<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>editar</title>
</head>
<body>
	<div align="center">
		<h3>¡Tienda - Todos vuelven!</h3>
		<div style="color: green; padding: 5px 0px 5px 0px;">Editar Jefe</div>
		
		<!-- Spring Form -->
		<form:form name="" method="post" modelAttribute="jefe">
			Jefe ID: <form:input type="text" path="jefe_id" readonly="true"/> <br>
			Nombre: <form:input type="text" path="nombre"/> <br>
			Celular: <form:input type="text" path="celular"/> <br>
			Nacionalidad: <form:input type="text" path="nacionalidad"/> <br><br>
			
			<button type="submit">Guardar</button>
			<button type="button" onclick="window.location.href='/senati/jefe/listar'">Cancelar</button>
		</form:form>
	</div>
</body>
</html>