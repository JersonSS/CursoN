<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Cuentas de Clientes</title>
</head>
<body>
    <h2>Lista de Cuentas de Clientes</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Usuario</th>
                <th>Fecha de Registro</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cuentaCliente" items="${bCuentasClientes}">
                <tr>
                    <td>${cuentaCliente.cuenta_id}</td>
                    <td>${cuentaCliente.usuario}</td>
                    <td>${cuentaCliente.fechaRegistro}</td>
                    <td>
                        <a href="/cuentas-clientes/editar/${cuentaCliente.cuenta_id}">Editar</a>
                        <a href="/cuentas-clientes/borrar/${cuentaCliente.cuenta_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/cuentas-clientes/registrar">Registrar Nueva Cuenta de Cliente</a>
</body>
</html>