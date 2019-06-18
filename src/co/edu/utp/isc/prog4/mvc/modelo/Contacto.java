/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.mvc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utp
 */
public class Contacto {

    private String nombre;
    private String alias;
    private List<Telefono> telefonos;

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefonos = new ArrayList<>();
    }

    public Contacto(String nombre, String alias) {
        this(nombre);
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    public void adicionarTelefono(Telefono telefono){
        this.telefonos.add(telefono);
    }

}
