<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrar Producto</title>
</head>
<body>
    <div align="center">
        <h3>¡Tienda - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Borrar Producto</div>
        
        <!-- Spring Form -->
        <form:form method="post" action="" modelAttribute="producto">
            <p>¿Está seguro de que desea eliminar este producto?</p>
            Producto ID: <form:input type="text" path="producto_id" readonly="true"/> <br>
            Nombre: <form:input type="text" path="nombre" readonly="true"/> <br>
            Precio: <form:input type="text" path="precio" readonly="true"/> <br>
            Stock: <form:input type="text" path="stock" readonly="true"/> <br>
            <button type="submit">Confirmar</button>
            <button type="button" onclick="window.location.href='/producto/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>