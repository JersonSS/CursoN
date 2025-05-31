<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Detalle de Venta</title>
</head>
<body>
    <div align="center">
        <h3>¡Librería - Todos vuelven!</h3>
        <div style="color: red; padding: 5px 0px 5px 0px;">Editar Detalle de Venta</div>
        
        <form:form method="post" action="" modelAttribute="detalleVenta">
            <form:hidden path="detalle_id"/>
            Cantidad: <form:input type="number" path="cantidad" min="1" cssClass="campo-cantidad" /> <br>
            Precio Unitario: <form:input type="text" path="precioUnitario" cssClass="campo-precio"/> <br>
            Subtotal: <form:input type="text" path="subtotal" cssClass="campo-subtotal" readonly="true"/> <br>
            
            Venta: <form:select path="venta.venta_id">
                    <form:options items="${bVentas}" itemValue="venta_id" itemLabel="venta_id"/>
            </form:select><br>
            
            Libro: <form:select path="libro.libro_id">
                    <form:options items="${bLibros}" itemValue="libro_id" itemLabel="titulo"/>
            </form:select><br><br>

            <button type="submit">Guardar</button>
            <button type="button" onclick="window.location.href='/libreria/detalles-ventas/listar'">Cancelar</button>
        </form:form>
    </div>

    <script>
    function calcularSubtotal() {
        const cantidad = parseFloat(document.querySelector('.campo-cantidad').value) || 0;
        const precio = parseFloat(document.querySelector('.campo-precio').value) || 0;
        const subtotal = cantidad * precio;
        document.querySelector('.campo-subtotal').value = subtotal.toFixed(2);
    }

        document.querySelector('.campo-cantidad').addEventListener('input', calcularSubtotal);
        document.querySelector('.campo-precio').addEventListener('input', calcularSubtotal);
    </script>
</body>
</html>