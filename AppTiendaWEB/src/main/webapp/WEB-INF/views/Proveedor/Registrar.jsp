<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registrar Proveedor</title>
</head>
<body>
    <div align= "center">
        <h1>¡Tienda - Todos vuelven!</h1>

        <h1>Registrar Proveedor</h1>
        <form:form action="" method="post" modelAttribute="proveedor"> 

            Nombre: <form:input type="text" path="nombre"/> <br><br>
            Telefono: <form:input type="text" path="telefono"/> <br><br>
            website: <form:input type="text" path="website"/> <br><br>
            RUC: <form:input type="text" path="ruc"/> <br><br>

        <button type="submit">Guardar</button> 
        <button type="button" onclick="window.location.href='/senati/proveedor/listar'">Cancelar</button> 
        </form:form>
    </div>
</body>
</html>