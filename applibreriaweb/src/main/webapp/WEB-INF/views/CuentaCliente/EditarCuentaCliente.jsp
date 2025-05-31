<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Cuenta de Cliente</title>
</head>
<body>
    <h2>Editar Cuenta de Cliente</h2>
    <form action="/cuentas-clientes/editar/${cuentaCliente.cuenta_id}" method="post">
        <label for="usuario">Usuario:</label>
        <input type="text" id="usuario" name="usuario" value="${cuentaCliente.usuario}" required><br>

        <label for="clave">Clave:</label>
        <input type="password" id="clave" name="clave" value="${cuentaCliente.clave}" required><br>

        <input type="submit" value="Actualizar">
    </form>
    <a href="/cuentas-clientes/listar">Volver a la lista</a>
</body>
</html>