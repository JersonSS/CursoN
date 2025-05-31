<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Detalle de Venta</title>
</head>
<body>
    <h2>Editar Detalle de Venta</h2>
    <form action="/detalles-ventas/editar/${detalleVenta.detalle_id}" method="post">
        <label for="cantidad">Cantidad:</label>
        <input type="number" id="cantidad" name="cantidad" value="${detalleVenta.cantidad}" required><br>

        <label for="precioUnitario">Precio Unitario:</label>
        <input type="number" id="precioUnitario" name="precioUnitario" value="${detalleVenta.precioUnitario}" required><br>

        <label for="subtotal">Subtotal:</label>
        <input type="number" id="subtotal" name="subtotal" value="${detalleVenta.subtotal}" required><br>

        <input type="submit" value="Actualizar">
    </form>
    <a href="/detalles-ventas/listar">Volver a la lista</a>
</body>
</html>