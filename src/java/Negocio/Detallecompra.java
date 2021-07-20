/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Microsoft
 */
@Entity
@Table(name = "DETALLECOMPRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecompra.findAll", query = "SELECT d FROM Detallecompra d")
    , @NamedQuery(name = "Detallecompra.findByIdDetalleCompra", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.idDetalleCompra = :idDetalleCompra")
    , @NamedQuery(name = "Detallecompra.findByCodArticulo", query = "SELECT d FROM Detallecompra d WHERE d.detallecompraPK.codArticulo = :codArticulo")
    , @NamedQuery(name = "Detallecompra.findByCantidad", query = "SELECT d FROM Detallecompra d WHERE d.cantidad = :cantidad")})
public class Detallecompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallecompraPK detallecompraPK;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private int cantidad;
    @JoinColumn(name = "ID_DETALLE_COMPRA", referencedColumnName = "ID_COMPRA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compra compra;

    public Detallecompra() {
    }

    public Detallecompra(DetallecompraPK detallecompraPK) {
        this.detallecompraPK = detallecompraPK;
    }

    public Detallecompra(DetallecompraPK detallecompraPK, int cantidad) {
        this.detallecompraPK = detallecompraPK;
        this.cantidad = cantidad;
    }

    public Detallecompra(String idDetalleCompra, String codArticulo) {
        this.detallecompraPK = new DetallecompraPK(idDetalleCompra, codArticulo);
    }

    public DetallecompraPK getDetallecompraPK() {
        return detallecompraPK;
    }

    public void setDetallecompraPK(DetallecompraPK detallecompraPK) {
        this.detallecompraPK = detallecompraPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallecompraPK != null ? detallecompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecompra)) {
            return false;
        }
        Detallecompra other = (Detallecompra) object;
        if ((this.detallecompraPK == null && other.detallecompraPK != null) || (this.detallecompraPK != null && !this.detallecompraPK.equals(other.detallecompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Negocio.Detallecompra[ detallecompraPK=" + detallecompraPK + " ]";
    }
    
}
