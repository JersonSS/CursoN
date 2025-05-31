<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Género</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Registrar Nuevo Género</div>

        <form:form method="post" action="" modelAttribute="genero">
            Nombre: <form:input type="text" path="nombre"/> <br>
            Descripción: <form:input type="text" path="descripcion"/> <br>

            <button type="submit">Registrar</button>
            <button type="button" onclick="window.location.href='/libreria/generos/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>