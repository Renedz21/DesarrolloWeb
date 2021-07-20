/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.List;

/**
 *
 * @author Microsoft
 */
public interface Venta_Servicio {

    public Object[] NuevaVenta(String cod_emp);

    public List ListarArticulos();

    public List AgregarArticulo(String codigo, String nombre, double precio, int cantidad);

    public List QuitarArticulo(String codigo);

    public Object[] BuscarProveedor(String codigo);

    public String GrabarPedido(String codigo);
}
