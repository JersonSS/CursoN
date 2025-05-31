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
                <th>Venta ID</th>
                <th>Libro</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="detalle" items="${bDetallesVentas}">
                <tr>
                    <td>${detalle.detalle_id}</td>
                    <td>${detalle.cantidad}</td>
                    <td>${detalle.precioUnitario}</td>
                    <td>${detalle.subtotal}</td>
                    <td>${detalle.venta.venta_id}</td>
                    <td>${detalle.libro.titulo}</td>
                    <td>
                        <a href="/libreria/detalles-ventas/editar/${detalle.detalle_id}">Editar</a>
                        <a href="/libreria/detalles-ventas/borrar/${detalle.detalle_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/libreria/index">Página Principal</a>
    <a href="/libreria/detalles-ventas/registrar">Registrar Nuevo Detalle</a>
</body>
</html>