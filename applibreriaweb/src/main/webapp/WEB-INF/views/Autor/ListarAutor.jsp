<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Autores</title>
</head>
<body>
    <h2>Lista de Autores</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Nacionalidad</th>
                <th>Fecha de Nacimiento</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="autor" items="${bAutores}">
                <tr>
                    <td>${autor.autor_id}</td>
                    <td>${autor.nombre}</td>
                    <td>${autor.apellido}</td>
                    <td>${autor.nacionalidad}</td>
                    <td>${autor.fechaNacimiento}</td>
                    <td>
                        <a href="/autores/editar/${autor.autor_id}">Editar</a>
                        <a href="/autores/borrar/${autor.autor_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/autores/registrar">Registrar Nuevo Autor</a>
</body>
</html>