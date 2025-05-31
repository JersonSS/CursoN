<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Cuentas de Clientes</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/listar.css">
</head>
<body>
    <h2>Lista de Cuentas de Clientes</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Usuario</th>
                <th>Fecha de Registro</th>
                <th>Cliente</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cuentaCliente" items="${bCuentasClientes}">
                <tr>
                    <td>${cuentaCliente.cuenta_id}</td>
                    <td>${cuentaCliente.usuario}</td>
                    <td>${cuentaCliente.fechaRegistro}</td>
                    <td>${cuentaCliente.cliente.nombre}</td>
                    <td>
                        <a href="/libreria/cuentas-clientes/editar/${cuentaCliente.cuenta_id}">Editar</a>
                        <a href="/libreria/cuentas-clientes/borrar/${cuentaCliente.cuenta_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/libreria/cuentas-clientes/registrar">Registrar Nueva Cuenta</a>
    <a href="/libreria/index">Volver al Inicio</a>
</body>
</html>