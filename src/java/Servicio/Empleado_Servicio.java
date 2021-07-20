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
public interface Empleado_Servicio {

    public String Grabar(String codigo, String nombre, String tipo, String usuario, String password);

    public Object[] validar(String usuario, String password);

    public Object[] Buscar(String codigo);

    public List Listar();

    public String Actualizar(String codigo, String nombre, String tipo, String usuario, String password);

    public String Eliminar(String codigo);

}
