<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Producto</title>
</head>
<body>
    <div align="center">
        <h3>¡Tienda - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Editar Producto</div>
        
        <!-- Spring Form -->
        <form:form method="post" action="/producto/editar" modelAttribute="producto">
            <form:hidden path="producto_id"/>
            Nombre: <form:input type="text" path="nombre"/> <br>
            Precio: <form:input type="text" path="precio"/> <br>
            Stock: <form:input type="text" path="stock"/> <br>
            <button type="submit">Guardar</button>
            <button type="button" onclick="window.location.href='/producto/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>