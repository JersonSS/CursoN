<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Géneros</title>
</head>
<body>
    <h2>Lista de Géneros</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripción</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="genero" items="${bGeneros}">
                <tr>
                    <td>${genero.genero_id}</td>
                    <td>${genero.nombre}</td>
                    <td>${genero.descripcion}</td>
                    <td>
                        <a href="/generos/editar/${genero.genero_id}">Editar</a>
                        <a href="/generos/borrar/${genero.genero_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/generos/registrar">Registrar Nuevo Género</a>
</body>
</html>