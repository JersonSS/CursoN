<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>LIBRERIA</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css">
</head>
<body>
    <h1>LIBRERIA VIRTUAL</h1>
    <p>VENTAS DE LIBROS DIGITALES Y FÍSICOS EN UN SOLO LUGAR</p>

    <ul>
        <li><a href="/libreria/libros/listar">Modulo Libros</a></li>
        <li><a href="/libreria/cuentas-clientes/listar">Modulo Cuentas de Clientes</a></li>
        <li><a href="/libreria/clientes/listar">Modulo Clientes</a></li>
        <li><a href="/libreria/autores/listar">Modulo Autores</a></li>
        <li><a href="/libreria/editoriales/listar">Modulo Editoriales</a></li>
        <li><a href="/libreria/detalles-ventas/listar">Modulo detalles ventas</a></li>
        <li><a href="/libreria/generos/listar">Modulo Generos</a></li>
        <li><a href="/libreria/ventas/listar">Modulo Ventas</a></li>
    </ul>
</body>
</html>