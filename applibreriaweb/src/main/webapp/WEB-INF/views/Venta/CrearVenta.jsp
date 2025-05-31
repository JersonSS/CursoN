<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Venta</title>
</head>
<body>
    <h2>Registrar Nueva Venta</h2>
    <form action="/ventas/registrar" method="post">
        <label for="total">Total:</label>
        <input type="number" id="total" name="total" required><br>

        <label for="fechaVenta">Fecha de Venta:</label>
        <input type="date" id="fechaVenta" name="fechaVenta" required><br>

        <input type="submit" value="Registrar">
    </form>
    <a href="/ventas/listar">Volver a la lista</a>
</body>
</html>