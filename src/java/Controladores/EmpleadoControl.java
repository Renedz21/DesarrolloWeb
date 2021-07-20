/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Presentadores.EmpleadoPresentador;
import Servicio.Empleado_Servicio;
import Servicio.Empleado_Servicio_Imp;
import Vista.FormularioEmpleado;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Microsoft
 */
public class EmpleadoControl extends org.apache.struts.action.Action {

    private EmpleadoPresentador ep;
    private Empleado_Servicio es;

    public void setEp(EmpleadoPresentador ep) {
        this.ep = ep;
    }

    public void setEs(Empleado_Servicio es) {
        this.es = es;
    }
    
    

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        //String ac = request.getParameter("acc");

        FormularioEmpleado f = (FormularioEmpleado) form;
        ep = new EmpleadoPresentador();
        es = new Empleado_Servicio_Imp();

        //String msg = es.Grabar(f.getCodigo(), f.getNombre(), f.getTipo(), f.getUsuario(), f.getPassword());
        ep.setMensaje(es.Grabar(f.getCodigo(), f.getNombre(), f.getTipo(), f.getUsuario(), f.getPassword()));
        request.getSession().setAttribute("ep", ep);
        
        /*if (ac.equals("Actualizar")) {
            ep.setMensaje(es.Actualizar(f.getCodigo(), f.getNombre(), f.getTipo(), f.getUsuario(), f.getPassword()));
        }*/

        return mapping.findForward("mensaje");
    }
}
