<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>listar</title>
</head>
<body>
    <div align= "center">
        <h1>¡Tienda - Todos vuelven!</h1>

        <h1>Registrar Categoria</h1>
        <form:form action="" method="post" modelAttribute="categoria"> 

            Descripcion: <form:input type="text" path="descripcion"/> <br><br>

            Jefe: <form:select path="jefe.jefe_id">
                    <form:options items="${bJefes}" itemValue="jefe_id" itemLabel="nombre"/>
                </form:select><br><br>

        <button type="submit">Guardar</button> 
        <button type="button" onclick="window.location.href='/senati/categoria/listar'">Cancelar</button> 
        </form:form>
    </div>
</body>
</html>
