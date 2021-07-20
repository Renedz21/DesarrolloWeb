/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Presentadores.PresentadorGeneral;
import Servicio.Proveedor_Servicio;
import Servicio.Proveedor_Servicio_Imp;
import Vista.FormBorrarProveedor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Microsoft
 */
public class ControladorBorrarProveedor extends org.apache.struts.action.Action {

    private PresentadorGeneral pp;
    private Proveedor_Servicio ps;

    public void setPp(PresentadorGeneral pp) {
        this.pp = pp;
    }

    public void setPs(Proveedor_Servicio ps) {
        this.ps = ps;
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        FormBorrarProveedor f = (FormBorrarProveedor) form;
        pp = new PresentadorGeneral();
        ps = new Proveedor_Servicio_Imp();
        pp.setMensaje(ps.Eliminar(f.getCodigo()));
        request.getSession().setAttribute("pp", pp);
        
        return mapping.findForward("delete");
    }
}
