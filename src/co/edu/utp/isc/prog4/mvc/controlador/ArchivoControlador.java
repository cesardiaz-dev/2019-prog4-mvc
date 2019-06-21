/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.mvc.controlador;

import co.edu.utp.isc.prog4.mvc.modelo.Contacto;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utp
 */
public class ArchivoControlador {

    private static ArchivoControlador instance;

    private ArchivoControlador() {
    }

    public static ArchivoControlador getInstance() {
        if (instance == null) {
            instance = new ArchivoControlador();
        }
        return instance;
    }

    public List<Contacto> cargarContactos() {
        List<Contacto> resp = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("agenda.cad"))) {
            boolean cont = true;
            while (cont) {
                Object readObject = ois.readObject();
                if (readObject != null && readObject instanceof Contacto) {
                    resp.add((Contacto) readObject);
                } else {
                    cont = false;
                }
            }
        } catch (Exception ex) {
//            System.err.println("Error al leer archivo: " + ex);
        }

        return resp;
    }

    public void guardarContactos(List<Contacto> contactos) {
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("agenda.cad"))) {
            for (Contacto contacto : contactos) {
                ois.writeObject(contacto);
            }
        } catch (Exception ex) {
            System.err.println("Error al escribir archivo: " + ex);
        }
    }
}
