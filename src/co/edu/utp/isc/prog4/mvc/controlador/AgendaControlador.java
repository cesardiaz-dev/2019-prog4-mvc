/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.mvc.controlador;

import co.edu.utp.isc.prog4.mvc.modelo.Contacto;
import co.edu.utp.isc.prog4.mvc.modelo.Telefono;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utp
 */
public class AgendaControlador {

    private static AgendaControlador instance;

    private AgendaControlador() {
        contactos = ArchivoControlador.getInstance().cargarContactos();
    }

    public static AgendaControlador getInstance() {
        if (instance == null) {
            instance = new AgendaControlador();
        }
        return instance;
    }

    private List<Contacto> contactos;

    public List<Contacto> getContactos() {
        return contactos;
    }

    public Contacto getContacto(int posicion) {
        return contactos.get(posicion);
    }

    public void agregarContacto(int posicion, String nombre, String alias, List<Telefono> telefonos) {
        if (contactos == null) {
            contactos = new ArrayList<>();
        }

        Contacto contacto = new Contacto(nombre, alias);
        contacto.setTelefonos(telefonos);
        if (posicion == -1) {
            contactos.add(contacto);
        } else {
            contactos.set(posicion, contacto);
        }
    }

    public void guardarContactosArchivo() {
        ArchivoControlador.getInstance()
                .guardarContactos(contactos);
    }

    public void eliminarContacto(int posicion) {
        contactos.remove(posicion);
    }

}
