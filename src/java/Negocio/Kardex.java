/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Microsoft
 */
@Entity
@Table(name = "KARDEX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kardex.findAll", query = "SELECT k FROM Kardex k")
    , @NamedQuery(name = "Kardex.findByIdKardex", query = "SELECT k FROM Kardex k WHERE k.idKardex = :idKardex")
    , @NamedQuery(name = "Kardex.findByFecha", query = "SELECT k FROM Kardex k WHERE k.fecha = :fecha")
    , @NamedQuery(name = "Kardex.findByDocumento", query = "SELECT k FROM Kardex k WHERE k.documento = :documento")
    , @NamedQuery(name = "Kardex.findByOperacion", query = "SELECT k FROM Kardex k WHERE k.operacion = :operacion")
    , @NamedQuery(name = "Kardex.findByIngreso", query = "SELECT k FROM Kardex k WHERE k.ingreso = :ingreso")
    , @NamedQuery(name = "Kardex.findBySalida", query = "SELECT k FROM Kardex k WHERE k.salida = :salida")
    , @NamedQuery(name = "Kardex.findByStock", query = "SELECT k FROM Kardex k WHERE k.stock = :stock")})
public class Kardex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_KARDEX")
    private String idKardex;
    @Basic(optional = false)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "DOCUMENTO")
    private String documento;
    @Basic(optional = false)
    @Column(name = "OPERACION")
    private String operacion;
    @Basic(optional = false)
    @Column(name = "INGRESO")
    private int ingreso;
    @Basic(optional = false)
    @Column(name = "SALIDA")
    private int salida;
    @Basic(optional = false)
    @Column(name = "STOCK")
    private int stock;

    public Kardex() {
    }

    public Kardex(String idKardex) {
        this.idKardex = idKardex;
    }

    public Kardex(String idKardex, String fecha, String documento, String operacion, int ingreso, int salida, int stock) {
        this.idKardex = idKardex;
        this.fecha = fecha;
        this.documento = documento;
        this.operacion = operacion;
        this.ingreso = ingreso;
        this.salida = salida;
        this.stock = stock;
    }

    public String getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(String idKardex) {
        this.idKardex = idKardex;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKardex != null ? idKardex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kardex)) {
            return false;
        }
        Kardex other = (Kardex) object;
        if ((this.idKardex == null && other.idKardex != null) || (this.idKardex != null && !this.idKardex.equals(other.idKardex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Negocio.Kardex[ idKardex=" + idKardex + " ]";
    }
    
}
