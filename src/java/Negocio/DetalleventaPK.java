/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Microsoft
 */
@Embeddable
public class DetalleventaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_DETALLE")
    private String idDetalle;
    @Basic(optional = false)
    @Column(name = "COD_ARTICULO")
    private String codArticulo;

    public DetalleventaPK() {
    }

    public DetalleventaPK(String idDetalle, String codArticulo) {
        this.idDetalle = idDetalle;
        this.codArticulo = codArticulo;
    }

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleventaPK)) {
            return false;
        }
        DetalleventaPK other = (DetalleventaPK) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Negocio.DetalleventaPK[ idDetalle=" + idDetalle + ", codArticulo=" + codArticulo + " ]";
    }
    
}
