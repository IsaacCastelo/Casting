/*
 * FrmRegistrarPerfil.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import BO.CastingBO;
import BO.PefilBO;
import Interfaces.ICastingBO;
import Interfaces.IPerfilBO;
import entidades.Casting;
import entidades.Perfil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmRegistrarPerfil extends javax.swing.JFrame {
    ICastingBO castingBO = new CastingBO();
    IPerfilBO perfilBO = new PefilBO();

    /**
     * Creates new form FrmRegistrarPerfil
     */
    public FrmRegistrarPerfil() {
        initComponents();
        llenarTablaCasting();
        llenarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCasting = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOjos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCabello = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbEdad = new javax.swing.JComboBox<>();
        cmbAltura = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPerfil = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Perfil - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCasting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Agente", "Cliente", "Costo", "Decripción"
            }
        ));
        jScrollPane1.setViewportView(tblCasting);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 565, 190));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32_1.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Floppy.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 355, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 355, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 355, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Estado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 32, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Sexo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 87, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Rango de altura");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 150, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Rango edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 203, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Color de cabello");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 258, -1, -1));
        getContentPane().add(txtOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 307, 157, -1));

        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Color de ojos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 315, -1, -1));
        getContentPane().add(txtCabello, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 254, 157, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 100, -1));

        cmbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "0-15", "5-18", "18-25", "25-35", "35-45", "45-60", "60" }));
        getContentPane().add(cmbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 198, -1, -1));

        cmbAltura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "0-1.50", "1.50-1.70", "1.70-1.90", "1.90" }));
        getContentPane().add(cmbAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 145, -1, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Femenino", "Masculino" }));
        getContentPane().add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 82, -1, -1));

        tblPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Sexo", "rango altura", "rango edad", "Color cabello", "Color ojos"
            }
        ));
        jScrollPane3.setViewportView(tblPerfil);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 565, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 1100, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validarCampos()) {
            Perfil perfil = new Perfil();
            perfil.setEstado(cmbEstado.getSelectedItem().toString());
            perfil.setRangoEdad(cmbEdad.getSelectedItem().toString());
            perfil.setColorPelo(txtCabello.getText());
            perfil.setColorOjos(txtOjos.getText());
            perfil.setSexo(cmbSexo.getSelectedItem().toString());
            perfil.setRangoAltura(cmbAltura.getSelectedItem().toString());
            perfilBO.regsistrar(perfil);
            llenarTabla();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (validarCampos()) {
            Perfil perfil = new Perfil();
            perfil.setEstado(cmbEstado.getSelectedItem().toString());
            perfil.setRangoEdad(cmbEdad.getSelectedItem().toString());
            perfil.setColorPelo(txtCabello.getText());
            perfil.setColorOjos(txtOjos.getText());
            perfil.setSexo(cmbSexo.getSelectedItem().toString());
            perfil.setRangoAltura(cmbAltura.getSelectedItem().toString());
            perfilBO.eliminar(perfil);
            llenarTabla();
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        cmbEstado.setSelectedIndex(0);
        txtCabello.setText("");
        txtOjos.setText("");
        cmbSexo.setSelectedIndex(0);
        cmbAltura.setSelectedIndex(0);
        cmbEdad.setSelectedIndex(0);
        
    }
    
/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public boolean validarCampos(){
        if((cmbSexo.getSelectedIndex() == 0)||(txtCabello.getText().length() == 0)||(txtOjos.getText().length() == 0)||
                (cmbSexo.getSelectedIndex() == 0)||(cmbAltura.getSelectedIndex() == 0)||(cmbEdad.getSelectedIndex() == 0)){
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Animal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            
            return true;
        }
    }
    
/**
 *
 * Metodo para llenar la tabla de perfiles
 */
    public void llenarTabla() {
        List<Perfil> productos = perfilBO.getPerfil();
        DefaultTableModel modelo = (DefaultTableModel) tblPerfil.getModel();
        modelo.setRowCount(0);
        for (Perfil prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getEstado();
            fila[1] = prov.getSexo();
            fila[2] = prov.getRangoAltura();
            fila[3] = prov.getRangoEdad();
            fila[4] = prov.getColorPelo();
            fila[5] = prov.getColorOjos();
            modelo.addRow(fila);
        }

    }
    
/**
 *
 * Metodo para llenar la tabla de castings
 */
    public void llenarTablaCasting() {
        List<Casting> productos = castingBO.getCasting();
        DefaultTableModel modelo = (DefaultTableModel) tblCasting.getModel();
        modelo.setRowCount(0);
        for (Casting prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getNombre();
            fila[1] = prov.getAgente().getNombre();
            fila[2] = prov.getCliente().getNombre();
            fila[3] = prov.getCosto();
            fila[4] = prov.getDescripcion();
            modelo.addRow(fila);
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAltura;
    private javax.swing.JComboBox<String> cmbEdad;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCasting;
    private javax.swing.JTable tblPerfil;
    private javax.swing.JTextField txtCabello;
    private javax.swing.JTextField txtOjos;
    // End of variables declaration//GEN-END:variables
}
