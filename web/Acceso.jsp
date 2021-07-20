
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="x" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    </head>
    <body>
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
                            <div class="barra collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav me-auto mb-0 mb-lg-0">
                                    <li class="nav-item">
                                        <a class="nav-link active" href="#">Inicio</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link active" href="#">Productos</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link active" href="#">Nosotros</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link active" href="#">Contactenos</a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link active dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                            Iniciar sesion
                                        </a>
                                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                                            <li><a class="dropdown-item" href="Acceso.jsp">Iniciar Sesion</a></li>
                                            <li><a class="dropdown-item" href="Registro.jsp">Registrate</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="text">
                    <h1 class="titulo-general">Lorem ipsum </h1>
                    <h6 class="abajo">Dir.: Av. Matorrales 365 | Telf.: 123456789 | Correo: abc@gmail.com</h6>
                </div>
            </div>
        </header>
        
        
                <div class="formulario">
            <x:form action="AccesoControl" method="post">
                <h1 class="titulo">INICIA SESION</h1>
                <div class="mb-3">
                    <label>Usuario:</label><br>
                    <x:text styleClass="form-control" property="usuario"/>
                </div>
                <div class="mb-3">
                    <label>Contraseña:</label><br>
                    <x:password styleClass="form-control" property="password"/>
                </div>
                <div class="d-grid gap-2">
                    <x:submit styleClass="btn btn-success" styleId="boton" value="Ingresar"/>
                </div>
            </x:form>
        </div>
        
        
    </body>
</html>
