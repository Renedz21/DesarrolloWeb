/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Microsoft
 */
public class FormularioEmpleado extends org.apache.struts.action.ActionForm {

    private String codigo, nombre, tipo, usuario, password;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (codigo == null || codigo.length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        if (nombre == null || nombre.length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        if (tipo == null || tipo.length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        if (usuario == null || usuario.length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        if (password == null || password.length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        return errors;
    }
}
