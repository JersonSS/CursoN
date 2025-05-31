<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Género</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Editar Género</div>
        
        <form:form method="post" action="" modelAttribute="genero">
            <form:hidden path="genero_id"/>
            Nombre: <form:input type="text" path="nombre"/> <br>
            Descripción: <form:input type="text" path="descripcion"/> <br>

            <button type="submit">Guardar</button>
            <button type="button" onclick="window.location.href='/libreria/generos/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>