<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Cliente</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Registrar Nuevo Cliente</div>

        <form:form method="post" action="" modelAttribute="cliente">
            Nombre: <form:input type="text" path="nombre"/> <br>
            Apellido: <form:input type="text" path="apellido"/> <br>
            DNI: <form:input type="text" path="dni"/> <br>
            Teléfono: <form:input type="text" path="telefono"/> <br>
            Correo: <form:input type="email" path="correo"/> <br>
            Dirección: <form:input type="text" path="direccion"/> <br>
            Fecha de Nacimiento: <form:input type="date" path="fechaNacimiento"/> <br>

            <button type="submit">Registrar</button>
            <button type="button" onclick="window.location.href='/libreria/clientes/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>