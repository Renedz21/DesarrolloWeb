package Servicio;

import Servicio.Empleado_Servicio;
import Persistencia.EmpleadoJpaController;
import Negocio.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Microsoft
 */
public class Empleado_Servicio_Imp implements Empleado_Servicio {

    private EmpleadoJpaController eja;

    public Empleado_Servicio_Imp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SupermercadoFinalPU");
        eja = new EmpleadoJpaController(emf);
    }

    @Override
    public String Grabar(String codigo, String nombre, String tipo, String usuario, String password) {
        Empleado emp = new Empleado(codigo, nombre, tipo, usuario, password);
        String msg;
        try {
            eja.create(emp);
            msg = "El empleado ha sido grabado con exito";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @Override
    public Object[] validar(String usuario, String password) {
        List lis = eja.findEmpleadoEntities();
        Object[] fila = new Object[5];
        for (int i = 0; i < lis.size(); i++) {
            Empleado emp = (Empleado) lis.get(i);
            if (emp.getUsuario().equals(usuario) && emp.getContraseña().equals(password)) {
                fila[0] = emp.getCodigo();
                fila[1] = emp.getNombre();
                fila[2] = emp.getUsuario();
            }
        }
        return fila;
    }

    @Override
    public Object[] Buscar(String codigo) {
        Empleado emp = eja.findEmpleado(codigo);
        if (emp != null) {
            Object[] fila = new Object[5];
            fila[0] = emp.getCodigo();
            fila[1] = emp.getNombre();
            fila[2] = emp.getTipo();
            fila[3] = emp.getUsuario();
            fila[4] = emp.getContraseña();
            return fila;

        }
        return null;
    }

    @Override
    public List Listar() {
        List lista = new ArrayList();
        List lis = eja.findEmpleadoEntities();
        for (int i = 0; i < lis.size(); i++) {
            Empleado emp = (Empleado) lis.get(i);
            Object[] fila = new Object[5];
            fila[0] = emp.getCodigo();
            fila[1] = emp.getNombre();
            fila[2] = emp.getTipo();
            fila[3] = emp.getUsuario();
            fila[4] = emp.getContraseña();
            lista.add(fila);
        }

        return lista;
    }

    @Override
    public String Actualizar(String codigo, String nombre, String tipo, String usuario, String password) {
        Empleado emp = new Empleado(codigo, nombre, tipo, usuario, password);
        String msg;
        try {
            eja.edit(emp);
            msg = "Datos del empleado actualizados";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @Override
    public String Eliminar(String codigo) {
        String msg;
        try {
            eja.destroy(codigo);
            msg = "Empleado ha sido eliminado";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

}
