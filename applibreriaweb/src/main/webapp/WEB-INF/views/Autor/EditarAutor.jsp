<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Autor</title>
</head>
<body>
    <h2>Editar Autor</h2>
    <form action="/autores/editar/${autor.autor_id}" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" value="${autor.nombre}" required><br>

        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido" value="${autor.apellido}" required><br>

        <label for="nacionalidad">Nacionalidad:</label>
        <input type="text" id="nacionalidad" name="nacionalidad" value="${autor.nacionalidad}" required><br>

        <label for="fechaNacimiento">Fecha de Nacimiento:</label>
        <input type="date" id="fechaNacimiento" name="fechaNacimiento" value="${autor.fechaNacimiento}" required><br>

        <input type="submit" value="Actualizar">
    </form>
    <a href="/autores/listar">Volver a la lista</a>
</body>
</html>