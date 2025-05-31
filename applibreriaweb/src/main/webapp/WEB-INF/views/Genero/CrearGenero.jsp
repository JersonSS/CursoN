<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar Género</title>
</head>
<body>
    <h2>Registrar Nuevo Género</h2>
    <form action="/generos/registrar" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>

        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" required><br>

        <input type="submit" value="Registrar">
    </form>
    <a href="/generos/listar">Volver a la lista</a>
</body>
</html>