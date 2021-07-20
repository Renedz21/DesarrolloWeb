/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Presentadores.PresentadorGeneral;
import Servicio.Venta_Servicio;
import Vista.AccesoProcesoVenta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Microsoft
 */
public class VentaControl extends org.apache.struts.action.Action {
    private PresentadorGeneral pp;
    private Venta_Servicio vs;

    public void setVs(Venta_Servicio vs) {
        this.vs = vs;
    }
    
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        AccesoProcesoVenta f = (AccesoProcesoVenta)form;
        
        if (f.getAccion().equals("Nueva Venta")) {
            pp = new PresentadorGeneral();
            pp.setFila(vs.NuevaVenta(f.getCod()));
            request.getSession().setAttribute("pp", pp);
        }
        
        if (f.getAccion().equals("Listar")) {
            return mapping.findForward("listado");
        }
        
        return mapping.findForward("ver");
    }
}
