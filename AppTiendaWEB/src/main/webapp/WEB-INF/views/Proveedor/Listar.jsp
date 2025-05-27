<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Listar Proveedores</title>
</head>
<body>
    <div align= "center">
        <h1>¡Tienda - Todos vuelven!</h1>
        <h3>Listado de Proveedores</h3>
        <a href="/senati/index">Index</a>
        <a href="/senati/proveedor/registrar">Registrar</a>

        <table>
        <caption style="color:green;">Listado de Proveedores</caption>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>telefono</th>
                <th>website</th>
                <th>RUC</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="proveedor" items="${bProveedores}">
                <tr>
                    <td>${proveedor.proveedor_id}</td>
                    <td>${proveedor.nombre}</td>
                    <td>${proveedor.telefono}</td>
                    <td>${proveedor.website}</td>
                    <td>${proveedor.ruc}</td>
                    <td>
                        <a href="/senati/proveedor/editar/${proveedor.proveedor_id}">Editar | </a>
                        <a href="/senati/proveedor/borrar/${proveedor.proveedor_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>