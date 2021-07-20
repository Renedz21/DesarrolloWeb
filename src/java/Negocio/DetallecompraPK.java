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
public class DetallecompraPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_DETALLE_COMPRA")
    private String idDetalleCompra;
    @Basic(optional = false)
    @Column(name = "COD_ARTICULO")
    private String codArticulo;

    public DetallecompraPK() {
    }

    public DetallecompraPK(String idDetalleCompra, String codArticulo) {
        this.idDetalleCompra = idDetalleCompra;
        this.codArticulo = codArticulo;
    }

    public String getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(String idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
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
        hash += (idDetalleCompra != null ? idDetalleCompra.hashCode() : 0);
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallecompraPK)) {
            return false;
        }
        DetallecompraPK other = (DetallecompraPK) object;
        if ((this.idDetalleCompra == null && other.idDetalleCompra != null) || (this.idDetalleCompra != null && !this.idDetalleCompra.equals(other.idDetalleCompra))) {
            return false;
        }
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Negocio.DetallecompraPK[ idDetalleCompra=" + idDetalleCompra + ", codArticulo=" + codArticulo + " ]";
    }
    
}
