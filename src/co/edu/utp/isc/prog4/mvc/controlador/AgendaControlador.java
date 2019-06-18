/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.mvc.controlador;

import co.edu.utp.isc.prog4.mvc.modelo.Contacto;
import co.edu.utp.isc.prog4.mvc.modelo.Telefono;
import java.util.List;

/**
 *
 * @author utp
 */
public class AgendaControlador {

    private static AgendaControlador instance;

    private AgendaControlador() {
    }

    public static AgendaControlador getInstance() {
        if (instance == null) {
            instance = new AgendaControlador();
        }
        return instance;
    }
    
    private List<Contacto> contactos;
    

    public void agregarContacto(String nombre, String alias, List<Telefono> telefonos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
