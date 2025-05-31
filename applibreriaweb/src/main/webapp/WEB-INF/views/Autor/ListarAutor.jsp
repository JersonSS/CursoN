<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Listar Autores</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/listar.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Lista de Autores</div>
        
        <table border="1" cellpadding="5">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Nacionalidad</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Acciones</th>
                </tr>
            </thead>
        <tbody>
            <c:forEach var="autor" items="${bAutores}">
                <tr>
                    <td>${autor.autor_id}</td>
                    <td>${autor.nombre}</td>
                    <td>${autor.apellido}</td>
                    <td>${autor.nacionalidad}</td>
                    <td>${autor.fechaNacimiento}</td>
                    <td>
                        <a href="/libreria/autores/editar/${autor.autor_id}">Editar</a>
                        <a href="/libreria/autores/borrar/${autor.autor_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
        <br>
        <a href="/libreria/index">Página Principal</a>
        <a href="/libreria/autores/registrar">Registrar Nuevo Autor</a>
    </div>
</body>
</html>