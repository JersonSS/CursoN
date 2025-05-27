<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Productos</title>
</head>
<body>
    <div align="center">
        <h3>¡Tienda - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Lista de Productos</div>
        <a href="/senati/index">Index</a>
        <a href="/senati/producto/registrar">Registrar</a>
        
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Marca</th>
                <th>Precio</th>
                <th>Fecha Fabricación</th>
                <th>Fecha Vencimiento</th>
                <th>Categoria</th>
                <th>Stock</th>
                <th>Acciones</th>
            </tr>
            <c:forEach items="${bProductos}" var="producto">
                <tr>
                    <td>${producto.producto_id}</td>
                    <td>${producto.nombre}</td>
                    <td>${producto.marca}</td>
                    <td>${producto.precio}</td>
                    <td>${producto.ffabricacion}</td>
                    <td>${producto.fvencimiento}</td>
                    <td>${producto.stock}</td>
                    <td>${producto.categoria.descripcion}</td>
                    <td>
                        <a href="/producto/editar/${producto.producto_id}">Editar</a>
                        <a href="/producto/borrar/${producto.producto_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>