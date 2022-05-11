/*
 * FrmBuscarCasting.java
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
public class FrmBuscarCasting extends javax.swing.JFrame {

    /**
     * Creates new form FrmBuscarCasting
     */
    public FrmBuscarCasting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtCodigoCasting = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFechaContratacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda de Casting - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código del Casting", "Nombre del Casting", "Fecha del Casting"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 545, 226));

        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32_1.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 274, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Código de Casting");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 47, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 101, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Fecha de Contratación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 157, -1, -1));

        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 252, -1, -1));

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 252, -1, -1));
        getContentPane().add(txtCodigoCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 47, 160, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 97, 160, -1));
        getContentPane().add(txtFechaContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 153, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1040, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (validarCampos()) {
            System.out.println("campos llenos");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        txtNombre.setText("");
        txtCodigoCasting.setText("");
        txtFechaContratacion.setText("");
        
    }
    
    public boolean validarCampos(){
        if (txtNombre.getText().length() == 0 || txtFechaContratacion.getText().length() == 0 || txtCodigoCasting.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Campos sin llenar", "animal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
            return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigoCasting;
    private javax.swing.JTextField txtFechaContratacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
