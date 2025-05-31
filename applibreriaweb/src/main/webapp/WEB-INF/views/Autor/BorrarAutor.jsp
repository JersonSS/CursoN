<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrar Autor</title>
</head>
<body>
    <h2>Borrar Autor</h2>
    <form action="/autores/borrar/${autor.autor_id}" method="post">
        <p>¿Estás seguro de que deseas borrar al autor <strong>${autor.nombre} ${autor.apellido}</strong>?</p>
        <input type="submit" value="Borrar">
    </form>
    <a href="/autores/listar">Volver a la lista</a>
</body>
</html>