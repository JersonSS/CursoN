<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Géneros</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/listar.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Lista de Géneros</div>
        
        <table border="1" cellpadding="5">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Acciones</th>
                </tr>
            </thead>
        <tbody>
            <c:forEach var="genero" items="${bGeneros}">
                <tr>
                    <td>${genero.genero_id}</td>
                    <td>${genero.nombre}</td>
                    <td>${genero.descripcion}</td>
                    <td>
                        <a href="/libreria/generos/editar/${genero.genero_id}">Editar</a>
                        <a href="/libreria/generos/borrar/${genero.genero_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
        <br>
        <a href="/libreria/index">Página Principal</a>
        <a href="/libreria/generos/registrar">Registrar Nuevo Género</a>
    </div>
</body>
</html>