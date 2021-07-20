/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tclilate file, choose Tools | Tclilates
 * and open the tclilate in the editor.
 */
package Servicio;

import Negocio.Cliente;
import Persistencia.ClienteJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Microsoft
 */
public class Cliente_Servicio_Imp implements Cliente_Servicio {

    private ClienteJpaController cja;

    public Cliente_Servicio_Imp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SupermercadoFinalPU");
        cja = new ClienteJpaController(emf);
    }

    @Override
    public String Grabar(String dni, String nombre, String direccion) {
        Cliente cli = new Cliente(dni, nombre,direccion);
        String msg;
        try {
            cja.create(cli);
            msg = "Cliente guardado";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @Override
    public Object[] Buscar(String dni) {
        Cliente cli = cja.findCliente(dni);
        if (cli != null) {
            Object[] fila = new Object[3];
            fila[0] = cli.getCodigo();
            fila[1] = cli.getNombre();
            fila[2] = cli.getDireccion();
            return fila;
            
        }
       return null;
    }

    @Override
    public List Listar() {
        List lista = new ArrayList();
        List lis = cja.findClienteEntities();
        for (int i = 0; i < lis.size(); i++) {
            Cliente cli = (Cliente)lis.get(i);
             Object[] fila = new Object[3];
            fila[0] = cli.getCodigo();
            fila[1] = cli.getNombre();
            fila[2] = cli.getDireccion();
            lista.add(fila);
        }
        
        return lista;
    }

    @Override
    public String Actualizar(String dni, String nombre, String direccion) {
        Cliente cli = new Cliente(dni, nombre,direccion);
        String msg;
        try {
            cja.edit(cli);
            msg = "Datos del cliente actualizados";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @Override
    public String Eliminar(String dni) {
        
        String msg;
       try {
            cja.destroy(dni);
            msg = "Cliente ha sido eliminado";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

}
