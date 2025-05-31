<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Autor</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/crear.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Registrar Nuevo Autor</div>

        <form:form method="post" action="" modelAttribute="autor">
            Nombre: <form:input type="text" path="nombre"/> <br>
            Apellido: <form:input type="text" path="apellido"/> <br>
            Nacionalidad: <form:input type="text" path="nacionalidad"/> <br>
            Fecha de Nacimiento: <form:input type="date" path="fechaNacimiento"/> <br>

            <button type="submit">Registrar</button>
            <button type="button" onclick="window.location.href='/libreria/autores/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>