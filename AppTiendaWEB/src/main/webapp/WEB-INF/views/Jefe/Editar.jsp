<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registrar Jefe</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h1 class="text-center">REGISTRAR JEFES</h1>
            <form:form action="" method="post" modelAttribute="jefe">
                <div class="form-group">
                    <label for="nombre">Nombre</label>
                    <form:input path="nombre" class="form-control" required="required" />
                </div>
                <div class="form-group">
                    <label for="celular">Celular</label>
                    <form:input path="celular" class="form-control" required="required" />
                </div>
                <div class="form-group">
                    <label for="nacionalidad">Nacionalidad</label>
                    <form:input path="nacionalidad" class="form-control" required="required" />
                </div>
                <button type="submit" class="btn btn-primary btn-block">Registrar</button>
                <button type="reset" class="btn btn-danger btn-block">Cancelar</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>