/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.mvc.vista;

import co.edu.utp.isc.prog4.mvc.modelo.Telefono;
import co.edu.utp.isc.prog4.mvc.modelo.TipoTelefono;

/**
 *
 * @author utp
 */
public interface FormularioVisitador {

    void cambiarTarjeta(String tarjeta);

    void agregarTelefono(TipoTelefono tipoTelefono, String numero);

    public void mostrarTelefono(Telefono get);
}
