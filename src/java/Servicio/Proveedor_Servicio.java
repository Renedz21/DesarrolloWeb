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
public interface Proveedor_Servicio {
    
    public /*static*/ String Grabar(String ruc, String nombre, String direccion);

    public Object[] Buscar(String ruc);

    public List Listar();
    
    public String Actualizar(String ruc, String nombre, String direccion);
    
    public String Eliminar(String ruc);
    
}
