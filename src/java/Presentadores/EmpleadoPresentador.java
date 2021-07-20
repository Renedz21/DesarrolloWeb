package Presentadores;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoPresentador {
    private String mensaje = "";
    private Object[] fila={"","","","",""};
    private List lista = new ArrayList();

    public EmpleadoPresentador() {
        lista.add(fila);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object[] getFila() {
        return fila;
    }

    public void setFila(Object[] fila) {
        this.fila = fila;
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }


    
    
    
}
