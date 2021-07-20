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
public interface Cliente_Servicio {
    
    public /*static*/ String Grabar(String dni, String nombre, String direccion);

    public Object[] Buscar(String dni);

    public List Listar();
    
    public String Actualizar(String dni, String nombre, String direccion);
    
    public String Eliminar(String dni);
    
}
