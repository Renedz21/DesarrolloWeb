<%-- 
    Document   : Portada
    Created on : 15/07/2021, 11:22:04 PM
    Author     : Microsoft
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Zilla+Slab:ital,wght@1,300&display=swap');
        </style>
        <link href="https://fonts.googleapis.com/css2?family=Yomogi&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
        </script>
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

        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="imgs/cafe-medio-ambiente.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="imgs/chocolate.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="imgs/frappe.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="imgs/irish.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="imgs/capucino.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="imgs/expreso.jpg" class="d-block w-100" alt="...">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls"
                    data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls"
                    data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        <br>
        <div class="todo">
            <div class="row">
                <div class="col-sm-6">
                    <div class="card">
                        <img class="bad" src="imgs/irish.jpg" alt="">
                        <br>
                        <div class="card-body">
                            <h2>Café Irish <span class="badge bg-secondary">Nuevo</span></h2>
                            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                            <a href="#" class="btn btn-success">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card">
                        <img class="bad" src="imgs/Macchiato.jpg" alt="">
                        <br>
                        <div class="card-body">
                            <h2>Café Macchiato <span class="badge bg-secondary">Nuevo</span></h2>
                            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                            <a href="#" class="btn btn-success">Go somewhere</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
