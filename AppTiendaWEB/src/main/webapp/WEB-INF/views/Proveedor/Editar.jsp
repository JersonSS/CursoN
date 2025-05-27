<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>editar</title>
</head>
<body>
    <div align="center">
        <h3>¡Tienda - Todos vuelven!</h3>
        <div style="color: green; padding: 5px 0px 5px 0px;">Editar Proveedor</div>
        
        <!-- Spring Form -->
        <form:form method="post" modelAttribute="proveedor">
            Proveedor ID: <form:input type="text" path="proveedor_id" readonly="true"/> <br><br>

            Nombre: <form:input type="text" path="nombre"/> <br><br>
            RUC: <form:input type="text" path="ruc"/> <br><br>
            Dirección: <form:input type="text" path="direccion"/> <br><br>

            <button type="submit">Guardar</button>
            <button type="button" onclick="window.location.href='/senati/proveedor/listar'">Cancelar</button>
        </form:form>

    </div>
</body>
</html>