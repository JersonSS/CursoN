<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Clientes</title>
</head>
<body>
    <h2>Lista de Clientes</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>DNI</th>
                <th>Teléfono</th>
                <th>Correo</th>
                <th>Dirección</th>
                <th>Fecha Nacimiento</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cliente" items="${bClientes}">
                <tr>
                    <td>${cliente.cliente_id}</td>
                    <td>${cliente.nombre}</td>
                    <td>${cliente.apellido}</td>
                    <td>${cliente.dni}</td>
                    <td>${cliente.telefono}</td>
                    <td>${cliente.correo}</td>
                    <td>${cliente.direccion}</td>
                    <td>${cliente.fechaNacimiento}</td>
                    <td>
                        <a href="/libreria/clientes/editar/${cliente.cliente_id}">Editar</a>
                        <a href="/libreria/clientes/borrar/${cliente.cliente_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/libreria/index">Página Principal</a>
    <a href="/libreria/clientes/registrar">Registrar Nuevo Cliente</a>
</body>
</html>