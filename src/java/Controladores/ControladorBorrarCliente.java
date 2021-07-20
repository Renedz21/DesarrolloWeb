/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Presentadores.PresentadorGeneral;
import Servicio.Cliente_Servicio;
import Servicio.Cliente_Servicio_Imp;
import Vista.FormBorrarCliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Microsoft
 */
public class ControladorBorrarCliente extends org.apache.struts.action.Action {

    private PresentadorGeneral pp;
    private Cliente_Servicio cs;

    public void setKo(PresentadorGeneral pp) {
        this.pp = pp;
    }

    public void setCs(Cliente_Servicio cs) {
        this.cs = cs;
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        FormBorrarCliente f = (FormBorrarCliente) form;
        
        pp = new PresentadorGeneral();
        cs = new Cliente_Servicio_Imp();
        
        pp.setMensaje(cs.Eliminar(f.getCodigo()));
        request.getSession().setAttribute("pp", pp);
        
        return mapping.findForward("delete");
    }
}
