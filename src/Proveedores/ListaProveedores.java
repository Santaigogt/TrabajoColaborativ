package Proveedores;

import java.util.ArrayList;

/**
 *
 * @author bizco
 */
public class ListaProveedores {

    private ArrayList<Proveedor> lista;

    public void agregar(Proveerdor prov) {
        lista.add(prov);
    }
/**
 * metodo que permite buscar proveedores en el arraylist
 * @param codigo Codigo del proveedor a buscar
 * @return Retorna el proveedor que coincide con el codigo o retorna null si no lo encuentra
 */
    public Proveedor buscar(int codigo) {
        for (Proveedor prov : lista) {
            if (prov.getCodigo() == codigo) {
                return prov;
            }
        }
        return null
    
    }

    public ArrayList<Proveedor> getLista() {
        return lista;
    }
//codigo nuevo
}