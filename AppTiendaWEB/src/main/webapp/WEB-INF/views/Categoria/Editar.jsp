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
		<div style="color: green; padding: 5px 0px 5px 0px;">Editar Categoria</div>
		
		<!-- Spring Form -->
		<form:form method="post" modelAttribute="categoria">
			Categoria ID: <form:input type="text" path="categoria_id" readonly="true"/> <br><br>

			Descripcion: <form:input type="text" path="descripcion"/> <br><br>

			Jefe: 
			<form:select path="jefe.jefe_id">
				<form:option value="" label="-- Seleccione un jefe --"/>
				<form:options items="${bJefes}" itemValue="jefe_id" itemLabel="nombre"/>
			</form:select><br><br>

			<button type="submit">Guardar</button>
			<button type="button" onclick="window.location.href='/senati/categoria/listar'">Cancelar</button>
		</form:form>

	</div>
</body>
</html>