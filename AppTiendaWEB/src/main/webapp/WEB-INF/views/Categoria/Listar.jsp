<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>registrar</title>
</head>
<body>
    <div align= "center">
        <h1>¡Tienda - Todos vuelven!</h1>
        <h3>Registrar Categoria</h3>
        <a href="/senati/index">Index</a>
        <a href="/senati/categoria/registrar">Registrar</a>

        <table>
        <caption style="color:green;">Listado de Categorias</caption>
            <tr>
                <th>Id</th>
                <th>Descripcion</th>
                <th>Jefe</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="categoria" items="${bCategorias}">
                <tr>
                    <td>${categoria.categoria_id}</td>
                    <td>${categoria.descripcion}</td>
                    <td>${categoria.jefe.nombre}</td>
                    <td>
                        <a href="/senati/categoria/editar/${categoria.categoria_id}">Editar | </a>
                        <a href="/senati/categoria/borrar/${categoria.categoria_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>