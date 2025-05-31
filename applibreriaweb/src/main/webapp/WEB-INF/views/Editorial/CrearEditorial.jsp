<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Editorial</title>
</head>
<body>
    <h2>Registrar Nueva Editorial</h2>
    <form action="/editoriales/registrar" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>

        <label for="pais">País:</label>
        <input type="text" id="pais" name="pais" required><br>

        <input type="submit" value="Registrar">
    </form>
    <a href="/editoriales/listar">Volver a la lista</a>
</body>
</html>