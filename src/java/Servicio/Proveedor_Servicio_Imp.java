/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tprolate file, choose Tools | Tprolates
 * and open the tprolate in the editor.
 */
package Servicio;

import Negocio.Proveedor;
import Persistencia.ProveedorJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Microsoft
 */
public class Proveedor_Servicio_Imp implements Proveedor_Servicio {

    private ProveedorJpaController eja;

    public Proveedor_Servicio_Imp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SupermercadoFinalPU");
        eja = new ProveedorJpaController(emf);
    }

    @Override
    public String Grabar(String ruc, String nombre, String direccion) {
        Proveedor pro = new Proveedor(ruc, nombre, direccion);
        String msg;
        try {
            eja.create(pro);
            msg = "Proveedor guardado";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @Override
    public Object[] Buscar(String ruc) {
        Proveedor pro = eja.findProveedor(ruc);
        if (pro != null) {
            Object[] fila = new Object[3];
            fila[0] = pro.getCodigo();
            fila[1] = pro.getNombre();
            fila[2] = pro.getDireccion();
            return fila;
            
        }
       return null;
    }

    @Override
    public List Listar() {
        List lista = new ArrayList();
        List lis = eja.findProveedorEntities();
        for (int i = 0; i < lis.size(); i++) {
            Proveedor pro = (Proveedor)lis.get(i);
             Object[] fila = new Object[3];
            fila[0] = pro.getCodigo();
            fila[1] = pro.getNombre();
            fila[2] = pro.getDireccion();
            lista.add(fila);
        }
        
        return lista;
    }

    @Override
    public String Actualizar(String ruc, String nombre, String direccion) {
        Proveedor pro = new Proveedor(ruc, nombre, direccion);
        String msg;
        try {
            eja.edit(pro);
            msg = "Datos del proveedor actualizados";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @Override
    public String Eliminar(String ruc) {
        String msg;
        try {
            eja.destroy(ruc);
            msg = "Proveedor ha sido eliminado";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

}
