<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <title>Borrar Cuenta de Cliente</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/borrar.css">
</head>
<body>
    <h2>Borrar Cuenta de Cliente</h2>
    <form:form modelAttribute="cuentaCliente" action="" method="post">
        <p>¿Estás seguro de que deseas borrar la cuenta?</p>

        Cuenta ID: <form:input type="text" path="cuenta_id" readonly="true"/> <br>
        usuario: <form:input type="text" path="usuario" readonly="true"/> <br>
        <input type="submit" value="Borrar">
    </form:form>
    <a href="/libreria/cuentas-clientes/listar">Volver a la lista</a>
</body>
</html>