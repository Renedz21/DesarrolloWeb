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
@Table(name = "DETALLEVENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleventa.findAll", query = "SELECT d FROM Detalleventa d")
    , @NamedQuery(name = "Detalleventa.findByIdDetalle", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.idDetalle = :idDetalle")
    , @NamedQuery(name = "Detalleventa.findByCodArticulo", query = "SELECT d FROM Detalleventa d WHERE d.detalleventaPK.codArticulo = :codArticulo")
    , @NamedQuery(name = "Detalleventa.findByCantidad", query = "SELECT d FROM Detalleventa d WHERE d.cantidad = :cantidad")})
public class Detalleventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleventaPK detalleventaPK;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private int cantidad;
    @JoinColumn(name = "ID_DETALLE", referencedColumnName = "ID_VENTA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Venta venta;

    public Detalleventa() {
    }

    public Detalleventa(DetalleventaPK detalleventaPK) {
        this.detalleventaPK = detalleventaPK;
    }

    public Detalleventa(DetalleventaPK detalleventaPK, int cantidad) {
        this.detalleventaPK = detalleventaPK;
        this.cantidad = cantidad;
    }

    public Detalleventa(String idDetalle, String codArticulo) {
        this.detalleventaPK = new DetalleventaPK(idDetalle, codArticulo);
    }

    public DetalleventaPK getDetalleventaPK() {
        return detalleventaPK;
    }

    public void setDetalleventaPK(DetalleventaPK detalleventaPK) {
        this.detalleventaPK = detalleventaPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleventaPK != null ? detalleventaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleventa)) {
            return false;
        }
        Detalleventa other = (Detalleventa) object;
        if ((this.detalleventaPK == null && other.detalleventaPK != null) || (this.detalleventaPK != null && !this.detalleventaPK.equals(other.detalleventaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Negocio.Detalleventa[ detalleventaPK=" + detalleventaPK + " ]";
    }
    
}
