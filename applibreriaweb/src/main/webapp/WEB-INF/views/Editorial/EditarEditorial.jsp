<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Editorial</title>
</head>
<body>
    <h2>Editar Editorial</h2>
    <form action="/editoriales/editar/${editorial.editorial_id}" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" value="${editorial.nombre}" required><br>

        <label for="pais">País:</label>
        <input type="text" id="pais" name="pais" value="${editorial.pais}" required><br>

        <input type="submit" value="Actualizar">
    </form>
    <a href="/editoriales/listar">Volver a la lista</a>
</body>
</html>