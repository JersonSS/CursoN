<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrar Venta</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/borrar.css">
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Borrar Venta</div>
        
        <form:form method="post" action="" modelAttribute="venta">
            <p>¿Está seguro de que desea eliminar esta venta?</p>
            Venta ID: <form:input type="text" path="venta_id" readonly="true"/> <br>
            Total: <form:input type="text" path="total" readonly="true"/> <br>
            <button type="submit">Confirmar</button>
            <button type="button" onclick="window.location.href='/libreria/ventas/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>