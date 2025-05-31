<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Venta</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Editar Venta</div>
        
        <form:form method="post" action="" modelAttribute="venta">
            <form:hidden path="venta_id"/>
            Total: <form:input type="text" path="total"/> <br>
            Entregado:
                    <form:select path="entregado">
                        <form:option value="true">Sí</form:option>
                        <form:option value="false">No</form:option>
                    </form:select><br>
            Fecha de Venta: <form:input type="date" path="fechaVenta"/> <br>

            Cliente: <form:select path="cliente.cliente_id">
                    <form:options items="${bClientes}" itemValue="cliente_id" itemLabel="nombre"/>
            </form:select><br><br>

            <button type="submit">Guardar</button>
            <button type="button" onclick="window.location.href='/libreria/ventas/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>