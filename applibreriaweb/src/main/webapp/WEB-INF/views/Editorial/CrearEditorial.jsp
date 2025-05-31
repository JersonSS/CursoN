<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Editorial</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/crear.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Registrar Nueva Editorial</div>

        <form:form method="post" action="" modelAttribute="editorial">
            Nombre: <form:input type="text" path="nombre"/> <br>
            País: <form:input type="text" path="pais"/> <br>

            <button type="submit">Registrar</button>
            <button type="button" onclick="window.location.href='/libreria/editoriales/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>