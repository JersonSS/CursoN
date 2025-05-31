<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crear Cuenta de Cliente</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/crear.css">
</head>
<body>
    <h2>Crear Cuenta de Cliente</h2>
    <form:form method="post" action="" modelAttribute="cuentaCliente">

        Usuario: <form:input type="text" id="usuario" path="usuario" required="true"/><br>
        Clave: <form:input type="password" id="clave" path="clave" required="true"/><br>
        Cliente: <form:select path="cliente.cliente_id">
                    <form:options items="${bClientes}" itemValue="cliente_id" itemLabel="nombre"/>
                    </form:select><br><br>
        
        <input type="submit" value="Crear">
    </form:form>
    <a href="/libreria/cuentas-clientes/listar">Volver a la lista</a>
</body>
</html>