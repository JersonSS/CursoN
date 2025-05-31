<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Detalles de Venta</title>
</head>
<body>
    <h2>Lista de Detalles de Venta</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Cantidad</th>
                <th>Precio Unitario</th>
                <th>Subtotal</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="detalleVenta" items="${bDetallesVentas}">
                <tr>
                    <td>${detalleVenta.detalle_id}</td>
                    <td>${detalleVenta.cantidad}</td>
                    <td>${detalleVenta.precioUnitario}</td>
                    <td>${detalleVenta.subtotal}</td>
                    <td>
                        <a href="/detalles-ventas/editar/${detalleVenta.detalle_id}">Editar</a>
                        <a href="/detalles-ventas/borrar/${detalleVenta.detalle_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/detalles-ventas/registrar">Registrar Nuevo Detalle de Venta</a>
</body>
</html>