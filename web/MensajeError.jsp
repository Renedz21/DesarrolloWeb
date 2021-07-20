<%-- 
    Document   : MensajeError
    Created on : 16/07/2021, 03:00:19 AM
    Author     : Microsoft
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensaje del sistema</title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
        </style>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Zilla+Slab:ital,wght@1,300&display=swap');
        </style>
        <link href="https://fonts.googleapis.com/css2?family=Yomogi&display=swap" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
        </script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="styles.css">
        <script src="https://kit.fontawesome.com/7a636b3642.js" crossorigin="anonymous"></script>
    </head>
    <body style="background:transparent">
        <header class="cabecera">
            <div class="arriba container-fluid">
                <div class="navegacion container-fluid">
                    <nav class="navbar sticky-top navbar-expand-lg navbar-dark">
                        <div class="container-fluid">
                            <img src="imgs/coffee.png" alt="" width="40" height="50" class="d-inline-block align-text-top">
                            <a class="navbar-brand" href="Portada.jsp">
                                Sound & Café
                            </a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                    aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                        </div>
                    </nav>
                </div>
                
                
                <% String msg = (String)session.getAttribute("msg"); %>
                
                <div class="text">
                    <h1 class="titulo-general">MENSAJE DEL SISTEMA</h1>
                    <div class="container">
                        <div class="alert alert-danger" role="alert">
                            <h3 class="mensaje"><%= msg %><i class="fas fa-skull"></i></h3>
                        </div>
                        <a class="btn btn-warning alerta" href="Portada.jsp">Volver a inicio</a>
                    </div>
                </div>
            </div>
        </header>

    </body>
</html>
