<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Género</title>
</head>
<body>
    <h2>Editar Género</h2>
    <form action="/generos/editar/${genero.genero_id}" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" value="${genero.nombre}" required><br>

        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" value="${genero.descripcion}" required><br>

        <input type="submit" value="Actualizar">
    </form>
    <a href="/generos/listar">Volver a la lista</a>
</body>
</html>