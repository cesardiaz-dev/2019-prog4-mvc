/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.mvc.vista;

import co.edu.utp.isc.prog4.mvc.modelo.Telefono;
import co.edu.utp.isc.prog4.mvc.modelo.TipoTelefono;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author utp
 */
public class PnlTelefonos extends javax.swing.JPanel {

    /**
     * Creates new form PnlTelefonos
     */
    public PnlTelefonos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTelefonos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Telefonos"));
        setLayout(new java.awt.BorderLayout());

        tblTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblTelefonosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblTelefonos);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnNuevo.setText("Nuevo Telefono");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);

        add(jPanel1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        formulario.cambiarTarjeta("formulario");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblTelefonosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelefonosMouseReleased
        if(evt.getClickCount() >= 2){
            formulario.mostrarTelefono(telefonos.get(tblTelefonos.getSelectedRow()));
        }
    }//GEN-LAST:event_tblTelefonosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTelefonos;
    // End of variables declaration//GEN-END:variables
    private List<Telefono> telefonos;
    private FormularioVisitador formulario;

    public void setFormulario(FormularioVisitador formulario) {
        this.formulario = formulario;
    }

    public void limpiar() {
        telefonos = new ArrayList<>();
    }
    
    public void setLista(List<Telefono> lista) {
        telefonos = lista;
        cargarLista();
    }

    public List<Telefono> getLista() {
        return telefonos;
    }

    public void cargarLista() {
        int numero = ((DefaultTableModel)tblTelefonos.getModel()).getRowCount();
        for (int i = 0; i < numero; i++) {
            ((DefaultTableModel)tblTelefonos.getModel()).removeRow(0);
        }
        
        for (int i = 0; i < telefonos.size(); i++) {
            ((DefaultTableModel)tblTelefonos.getModel()).addRow(new Object[]{
                telefonos.get(i).getTipo(),
                telefonos.get(i).getNumero()
            });
        }
    }

    public void agregarTelefono(TipoTelefono tipoTelefono, String numero) {
        if(telefonos == null){
            telefonos = new ArrayList<>();
        }
        telefonos.add(new Telefono(tipoTelefono, numero));
    }
}
