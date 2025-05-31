<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrar Cuenta de Cliente</title>
</head>
<body>
    <h2>Borrar Cuenta de Cliente</h2>
    <form action="/cuentas-clientes/borrar/${cuentaCliente.cuenta_id}" method="post">
        <p>¿Estás seguro de que deseas borrar la cuenta de cliente <strong>${cuentaCliente.usuario}</strong>?</p>
        <input type="submit" value="Borrar">
    </form>
    <a href="/cuentas-clientes/listar">Volver a la lista</a>
</body>
</html>