<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>borrar</title>
</head>
<body>
    <div align="center">
        <h3>¡Tienda - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Borrar Categoría</div>
        
        <!-- Spring Form -->
        <form:form method="post" action="" modelAttribute="categoria">
            <p>¿Está seguro de que desea eliminar la categoría?</p>
            Categoría ID: <form:input type="text" path="categoria_id" readonly="true"/> <br>
            Descripción: <form:input type="text" path="descripcion" /> <br>
            <button type="submit">Confirmar</button>
            <button type="button" onclick="window.location.href='/senati/categoria/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>