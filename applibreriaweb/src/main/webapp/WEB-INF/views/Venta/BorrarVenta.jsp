<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrar Venta</title>
</head>
<body>
    <h2>Borrar Venta</h2>
    <form action="/ventas/borrar/${venta.venta_id}" method="post">
        <p>¿Estás seguro de que deseas borrar esta venta?</p>
        <input type="submit" value="Borrar">
    </form>
    <a href="/ventas/listar">Volver a la lista</a>
</body>
</html>