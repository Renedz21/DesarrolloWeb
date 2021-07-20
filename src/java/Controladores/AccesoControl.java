/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Servicio.Empleado_Servicio_Imp;
import Servicio.Empleado_Servicio;
import Negocio.*;
import Vista.FormularioAcceso;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Microsoft
 */
public class AccesoControl extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        FormularioAcceso f = (FormularioAcceso) form;
        Empleado_Servicio ser = new Empleado_Servicio_Imp();
        Object[] fil = ser.validar(f.getUsuario(), f.getPassword());
        if (fil[0] != null) {
            request.getSession().setAttribute("fil", fil);
            return mapping.findForward("menu");
        } else {
            request.getSession().setAttribute("msg", "Acceso no Permitido");
            return mapping.findForward("mensaje");
        }
        //Empleado_Servicio empSer = new Empleado_Servicio_Imp(); 

    }
}
