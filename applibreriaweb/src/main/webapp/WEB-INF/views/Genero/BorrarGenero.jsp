<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrar Género</title>
</head>
<body>
    <h2>Borrar Género</h2>
    <form action="/generos/borrar/${genero.genero_id}" method="post">
        <p>¿Estás seguro de que deseas borrar el género <strong>${genero.nombre}</strong>?</p>
        <input type="submit" value="Borrar">
    </form>
    <a href="/generos/listar">Volver a la lista</a>
</body>
</html>