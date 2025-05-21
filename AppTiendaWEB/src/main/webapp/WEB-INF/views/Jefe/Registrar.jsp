<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>listar</title>
</head>
<body>
    <div align= "center">
        <h1>¡Tienda - Todos vuelven!</h1>

        </div>Registrar Jefe</div>
        <form:form action="" method="post" modelAttribute="jefe"> 
            Nombre: <form:input type="text" path="nombre"/> <br> 
            Celular: <form:input type="text" path="celular"/> <br> 
            Nacionalidad: <form:input type="text" path="nacionalidad"/> <br><br> 
        <button type="submit">Guardar</button> 
        <button type="button">Cancelar</button> 
        </form:form>
    </div>
</body>
</html>
