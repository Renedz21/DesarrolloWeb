package Negocio;

import java.text.SimpleDateFormat;
import java.util.*;

public class VentaObjeto {

    private String Id_venta;
    private String dni_cliente,cod_emp;

    public String getFecha() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(d);
    }

    public double getTotal() {
        double total = 0;
        return total;
    }

    public String getId_venta() {
        return Id_venta;
    }

    public void setId_venta(String Id_venta) {
        this.Id_venta = Id_venta;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }
    
    

}
