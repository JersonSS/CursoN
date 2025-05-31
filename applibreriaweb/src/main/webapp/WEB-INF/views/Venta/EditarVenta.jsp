<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Venta</title>
</head>
<body>
    <h2>Editar Venta</h2>
    <form action="/ventas/editar/${venta.venta_id}" method="post">
        <label for="total">Total:</label>
        <input type="number" id="total" name="total" value="${venta.total}" required><br>

        <label for="fechaVenta">Fecha de Venta:</label>
        <input type="date" id="fechaVenta" name="fechaVenta" value="${venta.fechaVenta}" required><br>

        <input type="submit" value="Actualizar">
    </form>
    <a href="/ventas/listar">Volver a la lista</a>
</body>
</html>