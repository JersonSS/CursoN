<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Cuenta de Cliente</title>
</head>
<body>
    <h2>Registrar Nueva Cuenta de Cliente</h2>
    <form action="/cuentas-clientes/registrar" method="post">
        <label for="usuario">Usuario:</label>
        <input type="text" id="usuario" name="usuario" required><br>

        <label for="clave">Clave:</label>
        <input type="password" id="clave" name="clave" required><br>

        <input type="submit" value="Registrar">
    </form>
    <a href="/cuentas-clientes/listar">Volver a la lista</a>
</body>
</html>