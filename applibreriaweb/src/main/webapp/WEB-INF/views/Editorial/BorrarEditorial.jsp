<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrar Editorial</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Borrar Editorial</div>
        
        <form:form method="post" action="" modelAttribute="editorial">
            <p>¿Está seguro de que desea eliminar esta editorial?</p>
            Editorial ID: <form:input type="text" path="editorial_id" readonly="true"/> <br>
            Nombre: <form:input type="text" path="nombre" readonly="true"/> <br>
            País: <form:input type="text" path="pais" readonly="true"/> <br>
            <button type="submit">Confirmar</button>
            <button type="button" onclick="window.location.href='/libreria/editoriales/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>