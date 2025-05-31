<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrar Autor</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Borrar Autor</div>
        
        <form:form method="post" action="" modelAttribute="autor">
            <p>¿Está seguro de que desea eliminar este autor?</p>
            Autor ID: <form:input type="text" path="autor_id" readonly="true"/> <br>
            Nombre: <form:input type="text" path="nombre" readonly="true"/> <br>
            Apellido: <form:input type="text" path="apellido" readonly="true"/> <br>
            <button type="submit">Confirmar</button>
            <button type="button" onclick="window.location.href='/libreria/autores/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>