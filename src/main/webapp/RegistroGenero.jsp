<%-- 
    Document   : RegistroGenero
    Created on : 30-may-2023, 22:15:41
    Author     : mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Registro genero</title>

        <!-- Bootstrap 5 CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body class="row align-items-center vh-100">

        <div class="d-flex justify-content-center">
            <form action="ServletRegistroGenero" method="POST">

                <label class="form-label">Ingresa nuevo genero</label>
                <input type="text" class="form-control" name="genero" id="genero" /><hr>
                <button type="submit" class="btn btn-danger">Ingresar</button>
                <button type="submit" href="home.jsp" class="btn btn-danger">Home</button>
            </form>
        </div>

        <!-- Bootstrap 5 Script -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
