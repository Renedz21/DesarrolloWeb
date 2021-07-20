<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title> 
        <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sidebars/">
        <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="sidebars.css" rel="stylesheet" type="text/css"/>
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>
        <script src="https://kit.fontawesome.com/7a636b3642.js" crossorigin="anonymous"></script>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% Object[] f = (Object[]) session.getAttribute("fil");%>
        <main>
            <div class="side flex-shrink-0 p-3" style="width: 230px;">
                <p class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
                    <span class="fs-5 fw-semibold">Bienvenido<br>
                        Codigo: <%= f[0]%><br>
                        Nombre: <%= f[1]%><br>
                    </span>
                </p>
                <ul class="list-unstyled ps-0">
                    <li class="mb-1">
                        <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse"
                                data-bs-target="#home-collapse" aria-expanded="false">
                            Empleados
                        </button>
                        <div class="collapse" id="home-collapse">
                            <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <li>
                                    <t:form action="IngresarRegistroEmpleado">
                                        <t:submit property="ingresar" value="Registrar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarListarEmpleado">
                                        <t:submit property="listar" value="Listar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarActualizarEmpleado">
                                        <t:submit property="actualizar" value="Actualizar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarBuscarEmpleado">
                                        <t:submit property="buscar" value="Buscar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarBorrarEmpleado">
                                        <t:submit property="eliminar" value="Eliminar"/>
                                    </t:form>
                                </li>
                                <li><a href="#" class="link-dark rounded">Registrar</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="mb-1">
                        <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse"
                                data-bs-target="#dashboard-collapse" aria-expanded="false">
                            Clientes
                        </button>
                        <div class="collapse" id="dashboard-collapse">
                            <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <li>
                                    <t:form action="IngresarRegistroCliente">
                                        <t:submit property="ingresar" value="Registrar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarListarCliente">
                                        <t:submit property="listar" value="Listar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarActualizarCliente">
                                        <t:submit property="actualizar" value="Actualizar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarBuscarCliente">
                                        <t:submit property="buscar" value="Buscar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarBorrarCliente">
                                        <t:submit property="eliminar" value="Eliminar"/>
                                    </t:form>
                                </li>

                                <li><a href="AgregarCliente.jsp" class="link-dark rounded">Registrar</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="mb-1">
                        <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse"
                                data-bs-target="#orders-collapse" aria-expanded="false">
                            Proveedores
                        </button>
                        <div class="collapse" id="orders-collapse">
                            <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <li>
                                    <t:form action="IngresarRegistroProveedor">
                                        <t:submit property="ingresar" value="Registrar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarListarProveedor">
                                        <t:submit property="listar" value="Listar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarActualizarProveedor">
                                        <t:submit property="actualizar" value="Actualizar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarBuscarProveedor">
                                        <t:submit property="buscar" value="Buscar"/>
                                    </t:form>
                                </li>
                                <li>
                                    <t:form action="IngresarBorrarProveedor">
                                        <t:submit property="eliminar" value="Eliminar"/>
                                    </t:form>
                                </li>
                                <li><a href="AgregarProveedor.jsp" class="link-dark rounded">Registrar</a></li>
                                
                            </ul>
                        </div>
                    </li>
                    <li class="mb-1">
                        <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse"
                                data-bs-target="#ve-collapse" aria-expanded="false">
                            Ventas
                        </button>
                        <div class="collapse" id="ve-collapse">
                            <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <li>
                                    <t:form action="VentaControl">
                                        <t:submit property="accion" value="Nueva Venta"/>
                                    </t:form>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li class="mb-1">
                        <a href="Menu.jsp" class="link-dark rounded">Volver</a>
                    </li>
                </ul>
            </div>

            <div class="b-example-divider"></div>


            <script src="sidebars.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
            </script>
            
            <div class="re">
                <t:form action="ControladorBorrarCliente" method="post">
                    <h1 class="titulo">BORRAR CLIENTE</h1>
                    <div class="mb-3">
                        <label>Ingrese el Dni del cliente a borrar:</label>
                        <t:text property="codigo" styleClass="form-control"/>
                    </div>
                    <div class="d-grid gap-2">
                        <t:submit styleClass="btn btn-outline-danger" styleId="acc" value="Eliminar"/>
                    </div>
                </t:form>
            </div>
        </main>
    </body>
</html>
