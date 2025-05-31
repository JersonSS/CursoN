<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Editoriales</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/listar.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Lista de Editoriales</div>
        
        <table border="1" cellpadding="5">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>País</th>
                    <th>Acciones</th>
                </tr>
            </thead>
        <tbody>
            <c:forEach var="editorial" items="${bEditoriales}">
                <tr>
                    <td>${editorial.editorial_id}</td>
                    <td>${editorial.nombre}</td>
                    <td>${editorial.pais}</td>
                    <td>
                        <a href="/libreria/editoriales/editar/${editorial.editorial_id}">Editar</a>
                        <a href="/libreria/editoriales/borrar/${editorial.editorial_id}">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
        <br>
        <a href="/libreria/index">Página Principal</a>
        <a href="/libreria/editoriales/registrar">Registrar Nueva Editorial</a>
    </div>
</body>
</html>