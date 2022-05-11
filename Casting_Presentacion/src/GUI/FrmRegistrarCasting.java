/*
 * FrmRegistrarCasting.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmRegistrarCasting extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarCasting
     */
    public FrmRegistrarCasting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoCastings = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblIDCasting = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtIDCasting = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCoste = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaFases = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarFase = new javax.swing.JButton();
        btnBorrarFase = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFechaFase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Casting - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListadoCastings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Casting", "Nombre", "Fecha", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblListadoCastings);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 23, 572, 194));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Floppy.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32_1.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 75, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 71, 194, -1));

        lblIDCasting.setText("ID");
        getContentPane().add(lblIDCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 22, -1, -1));

        lblFecha.setText("Fecha");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 128, -1, -1));
        getContentPane().add(txtIDCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 18, 86, -1));

        jLabel1.setText("Tipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 183, -1, -1));

        jLabel2.setText("Coste");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 227, -1, -1));

        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 282, -1, -1));
        getContentPane().add(txtCoste, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 223, 194, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 278, 194, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "On-line", "Presencial" }));
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 178, -1, -1));

        tblListaFases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Fecha Inicio", "Casting"
            }
        ));
        jScrollPane2.setViewportView(tblListaFases);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 278, 572, 196));

        jLabel4.setText("Fases");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 250, -1, -1));

        btnRegistrarFase.setText("Registrar Fase");
        btnRegistrarFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 510, -1, -1));

        btnBorrarFase.setText("Borrar Fase");
        getContentPane().add(btnBorrarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 510, -1, -1));

        jLabel5.setText("Fecha fase:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));
        getContentPane().add(txtFechaFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 514, 115, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (validarCamposDatos()) {
            System.out.println("campos llenos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
           this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFaseActionPerformed
        if (validarCampoFase()) {
            System.out.println("fase en orden");
        }
    }//GEN-LAST:event_btnRegistrarFaseActionPerformed

/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        txtNombre.setText("");
        txtIDCasting.setText("");
        txtCoste.setText("");
        txtDescripcion.setText("");
        cmbTipo.setSelectedIndex(0);
        
    }
    
    public boolean validarCamposDatos(){
        if (txtNombre.getText().length() == 0 || txtIDCasting.getText().length() == 0 || txtDescripcion.getText().length() == 0 
            || txtCoste.getText().length() == 0 || cmbTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Campos sin llenar", "animal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
            return true;
    }
    
    public boolean validarCampoFase(){
        if (txtFechaFase.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Te falto introducir la fecha", "animal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
            return true;
    }
    
       private void centrarVentana() {
        Dimension screenSize, frameSize;
        int x, y;
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize = getSize();
        x = (screenSize.width - frameSize.width) / 2;
        y = (screenSize.height - frameSize.height) / 2;
        setLocation(x, y);
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarFase;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarFase;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIDCasting;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblListaFases;
    private javax.swing.JTable tblListadoCastings;
    private javax.swing.JTextField txtCoste;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaFase;
    private javax.swing.JTextField txtIDCasting;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
