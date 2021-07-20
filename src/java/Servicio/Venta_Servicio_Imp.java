package Servicio;

import Negocio.Articulo;
import Negocio.VentaDAO;
import Negocio.VentaObjeto;
import java.util.ArrayList;
import java.util.List;

public class Venta_Servicio_Imp implements Venta_Servicio {

    private VentaObjeto vo;
    private VentaDAO vd;

    @Override
    public Object[] NuevaVenta(String cod_emp) {
        vo = new VentaObjeto();
        vo.setId_venta(getNumero());
        vo.setCod_emp(cod_emp);
        Object[] fila = new Object[5];
        fila[0]=vo.getId_venta();
        fila[1]=vo.getFecha();
        fila[2]=vo.getTotal();
        fila[3]=vo.getDni_cliente();
        fila[4]=vo.getCod_emp();
        return fila;

    }
    
    private String getNumero(){
        String num="V002";
        return num;
    }

    @Override
    public List ListarArticulos() {
        List lis = vd.listarArticulo();
        List listado = new ArrayList();
        for (int i = 0; i < lis.size(); i++) {
            Articulo arti = (Articulo) lis.get(i);
            Object[]fila = new Object[4];
            fila[0]=arti.getCodArt();
            fila[1] = arti.getNombre();
            fila[2] = arti.getPrecio();
            fila[3] = arti.getStock();
            listado.add(fila);
        }
        return listado;
    }

    @Override
    public List AgregarArticulo(String codigo, String nombre, double precio, int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List QuitarArticulo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] BuscarProveedor(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String GrabarPedido(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
