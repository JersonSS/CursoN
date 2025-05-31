<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Editoriales</title>
</head>
<body>
    <h2>Lista de Editoriales</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>País</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="editorial" items="${bEditoriales}">
                <tr>
                    <td>${editorial.editorial_id}</td>
                    <td>${editorial.nombre}</td>
                    <td>${editorial.pais}</td>
                    <td>
                        <a href="/editoriales/editar/${editorial.editorial_id}">Editar</a>
                        <a href="/editoriales/borrar/${editorial.editorial_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/editoriales/registrar">Registrar Nueva Editorial</a>
</body>
</html>