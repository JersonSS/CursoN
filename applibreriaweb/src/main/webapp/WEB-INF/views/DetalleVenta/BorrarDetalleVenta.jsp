<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrar Detalle de Venta</title>
</head>
<body>
    <h2>Borrar Detalle de Venta</h2>
    <form action="/detalles-ventas/borrar/${detalleVenta.detalle_id}" method="post">
        <p>¿Estás seguro de que deseas borrar este detalle de venta?</p>
        <input type="submit" value="Borrar">
    </form>
    <a href="/detalles-ventas/listar">Volver a la lista</a>
</body>
</html>