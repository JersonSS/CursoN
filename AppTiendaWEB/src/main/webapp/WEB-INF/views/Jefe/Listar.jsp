<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>registrar</title>
</head>
<body>
    <div align= "center">
        <h1>¡Tienda - Todos vuelven!</h1>
        <h3>Registrar Jefe</h3>
        <a href="/senati/index">Index</a>
        <a href="/senati/jefe/registrar">Registrar</a>

        <table>
        <caption style="color:green;">Listado de Jefes</caption>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Nacionalidad</th>
                <th>Celular</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="jefe" items="${bJefes}">
                <tr>
                    <td>${jefe.jefe_id}</td>
                    <td>${jefe.nombre}</td>
                    <td>${jefe.nacionalidad}</td>
                    <td>${jefe.celular}</td>
                    <td>
                        <a href="editar/${jefe.jefe_id}">Editar</a>
                        <a href="eliminar/${jefe.jefe_id}">Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>