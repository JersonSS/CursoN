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
                <th>Fecha de Venta</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="venta" items="${bVentas}">
                <tr>
                    <td>${venta.venta_id}</td>
                    <td>${venta.total}</td>
                    <td>${venta.fechaVenta}</td>
                    <td>
                        <a href="/ventas/editar/${venta.venta_id}">Editar</a>
                        <a href="/ventas/borrar/${venta.venta_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/ventas/registrar">Registrar Nueva Venta</a>
</body>
</html>