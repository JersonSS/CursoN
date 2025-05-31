<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Ventas</title>
</head>
<body>
    <h2>Lista de Ventas</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Total</th>
                <th>Entregado</th>
                <th>Fecha de Venta</th>
                <th>Cliente</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="venta" items="${bVentas}">
                <tr>
                    <td>${venta.venta_id}</td>
                    <td>${venta.total}</td>
                    <td>${venta.entregado ? 'Sí' : 'No'}</td>
                    <td>${venta.fechaVenta}</td>
                    <td>${venta.cliente.nombre}</td>
                    <td>
                        <a href="/libreria/ventas/editar/${venta.venta_id}">Editar</a>
                        <a href="/libreria/ventas/borrar/${venta.venta_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/libreria/index">Página Principal</a>
    <a href="/libreria/ventas/registrar">Registrar Nueva Venta</a>
</body>
</html>