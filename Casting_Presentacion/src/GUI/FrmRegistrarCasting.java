/*
 * FrmRegistrarCasting.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import BO.FaseBO;
import Interfaces.IFaseBO;
import entidades.Fase;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmRegistrarCasting extends javax.swing.JFrame {
    int numeroFase=0;
    IFaseBO faseBO = new FaseBO(); 

    /**
     * Creates new form FrmRegistrarCasting
     */
    public FrmRegistrarCasting() {
        initComponents();
        llenarTablaFases();
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
        scrollPane1 = new javax.swing.JScrollPane();
        tblListaFases = new javax.swing.JTable();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarFase = new javax.swing.JButton();
        btnBorrarFase = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();

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

        lblNombre.setForeground(new java.awt.Color(204, 255, 255));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 75, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 71, 194, -1));

        lblIDCasting.setText("ID");
        lblIDCasting.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lblIDCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 22, -1, -1));

        lblFecha.setForeground(new java.awt.Color(204, 255, 255));
        lblFecha.setText("Fecha");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 128, -1, -1));
        getContentPane().add(txtIDCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 18, 86, -1));

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Tipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 183, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Coste");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 227, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
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
        scrollPane1.setViewportView(tblListaFases);

        getContentPane().add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 278, 572, 196));
        getContentPane().add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Fases");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 250, -1, -1));

        btnRegistrarFase.setText("Registrar Fase");
        btnRegistrarFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, -1, -1));

        btnBorrarFase.setText("Borrar Fase");
        getContentPane().add(btnBorrarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Fecha fase:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));
        getContentPane().add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1070, 630));

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
            numeroFase=numeroFase+1;
            Date fecha = new Date();
            String año = datePicker1.getDateStringOrEmptyString().substring(0,datePicker1.getDateStringOrEmptyString().indexOf("-"));
            String mes = datePicker1.getDateStringOrEmptyString().substring(5,datePicker1.getDateStringOrEmptyString().lastIndexOf("-"));
            String dia = datePicker1.getDateStringOrEmptyString().substring(8);
            fecha.setYear(Integer.parseInt(año)-1900);
            fecha.setMonth(Integer.parseInt(mes)-1);
            fecha.setDate(Integer.parseInt(dia));
            Fase fase = new Fase(numeroFase, fecha);
            faseBO.regsistrar(fase);
            llenarTablaFases();
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

/**
 *
 * Metodo para validar los campos estén llenos
 */
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
        if (datePicker1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Te falto introducir la fecha", "animal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
            return true;
    }
    
/**
 *
 * Metodo para llenar la tabla de fases
 */
    public void llenarTablaFases() {
        List<Fase> productos = faseBO.getCliente();
        DefaultTableModel modelo = (DefaultTableModel) tblListaFases.getModel();
        modelo.setRowCount(0);
        for (Fase prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getNumero();
            fila[1] = prov.getFechaInicio();
            
            modelo.addRow(fila);
        }

    }
    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarFase;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarFase;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIDCasting;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tblListaFases;
    private javax.swing.JTable tblListadoCastings;
    private javax.swing.JTextField txtCoste;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIDCasting;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
