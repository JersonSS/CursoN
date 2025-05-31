<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrar Detalle de Venta</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Borrar Detalle de Venta</div>
        
        <form:form method="post" action="" modelAttribute="detalleVenta">
            <p>¿Está seguro de que desea eliminar este detalle de venta?</p>
            Detalle ID: <form:input type="text" path="detalle_id" readonly="true"/> <br>
            Cantidad: <form:input type="text" path="cantidad" readonly="true"/> <br>
            Libro: <form:input type="text" path="libro.titulo" readonly="true"/> <br>
            <button type="submit">Confirmar</button>
            <button type="button" onclick="window.location.href='/libreria/detalles-ventas/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>