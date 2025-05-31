<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listar Libros</title>
</head>
<body>
    <h2>Lista de Libros</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Título</th>
                <th>Digital</th>
                <th>Edición</th>
                <th>Número de Páginas</th>
                <th>Stock</th>
                <th>Precio</th>
                <th>Fecha de Publicación</th>
                <th>Fecha de Registro</th>
                <th>Editorial</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="libro" items="${bLibros}">
                <tr>
                    <td>${libro.libro_id}</td>
                    <td>${libro.titulo}</td>
                    <td>${libro.digital ? 'Sí' : 'No'}</td>
                    <td>${libro.edicion}</td>
                    <td>${libro.numeroPaginas}</td>
                    <td>${libro.stock}</td>
                    <td>${libro.precio}</td>
                    <td>${libro.fechaPublicacion}</td>
                    <td>${libro.fechaRegistro}</td>
                    <td>${libro.editorial.nombre}</td>
                    <td>
                        <a href="/libreria/libros/editar/${libro.libro_id}">Editar</a>
                        <a href="/libreria/libros/borrar/${libro.libro_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/libreria/index">Página Principal</a>
    <a href="/libreria/libros/registrar">Registrar Nuevo Libro</a>
</body>
</html>