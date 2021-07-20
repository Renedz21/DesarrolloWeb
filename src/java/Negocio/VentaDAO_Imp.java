/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Persistencia.ArticuloJpaController;
import java.util.List;

/**
 *
 * @author Microsoft
 */
public class VentaDAO_Imp implements VentaDAO{

    private ArticuloJpaController ajp;

    public void setAjp(ArticuloJpaController ajp) {
        this.ajp = ajp;
    }   
    
    
    @Override
    public List listarArticulo() {
        return ajp.findArticuloEntities();
    }
    
}
