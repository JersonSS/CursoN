<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrar Editorial</title>
</head>
<body>
    <h2>Borrar Editorial</h2>
    <form action="/editoriales/borrar/${editorial.editorial_id}" method="post">
        <p>¿Estás seguro de que deseas borrar la editorial <strong>${editorial.nombre}</strong>?</p>
        <input type="submit" value="Borrar">
    </form>
    <a href="/editoriales/listar">Volver a la lista</a>
</body>
</html>