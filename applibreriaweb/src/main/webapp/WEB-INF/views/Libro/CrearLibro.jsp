<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Libro</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/crear.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Registrar Nuevo Libro</div>

        <form:form method="post" action="" modelAttribute="libro">
            Título: <form:input type="text" path="titulo"/> <br>
            Digital:
                    <form:select path="digital">
                        <form:option value="true">Sí</form:option>
                        <form:option value="false">No</form:option>
                    </form:select><br>
            Edición: <form:input type="number" path="edicion" min="1" max="127" /> <br>
            Número de Páginas: <form:input type="number" path="numeroPaginas"/> <br>
            Stock: <form:input type="number" path="stock"/> <br>
            Precio: <form:input type="text" path="precio"/> <br>
            Fecha de Publicación: <form:input type="date" path="fechaPublicacion"/> <br>
            Fecha de Registro: <form:input type="date" path="fechaRegistro"/> <br>

            Editorial: <form:select path="editorial.editorial_id">
                    <form:options items="${bEditoriales}" itemValue="editorial_id" itemLabel="nombre"/>
            </form:select><br><br>

            <button type="submit">Registrar</button>
            <button type="button" onclick="window.location.href='/libreria/libros/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>