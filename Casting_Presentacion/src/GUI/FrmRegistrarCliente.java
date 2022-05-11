/*
 * FrmRegistrarCliente.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import BO.ClienteBO;
import Interfaces.IClienteBO;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Persona;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmRegistrarCliente extends javax.swing.JFrame {
    
    IClienteBO clienteBO = new ClienteBO();  

    /**
     * Creates new form FrmRegistrarCliente
     */
    public FrmRegistrarCliente() {
        initComponents();
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        cmbTipoPublicidad = new javax.swing.JComboBox<>();
        txtContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Clientes - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dirección", "Teléfono", "Persona de Contacto", "Tipo de Publicidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 679, 354));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 403, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 33, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Dirección");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 215, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Teléfono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 79, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Persona de Contacto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 121, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Tipo de publicidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 171, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 29, 157, -1));

        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 253, 157, -1));

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Floppy.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 392, -1, -1));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 392, -1, -1));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 392, -1, -1));

        txtTelefono.setText(" ");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 75, 157, -1));

        cmbTipoPublicidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------", "moda -Publicidad", "cine" }));
        getContentPane().add(cmbTipoPublicidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 166, 166, -1));

        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 117, 157, -1));

        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Calle");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 257, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Número");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 303, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Colonia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 349, -1, -1));

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 299, 157, -1));

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 345, 157, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 211, 157, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1160, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if(validarCampos()){
           if(validarActividad()){
               //guardar
               Cliente cliente = new Cliente();
               cliente.setNombre(txtNombre.getText());
               Direccion direccion = new Direccion(txtCalle.getText(),txtNumero.getText(),txtColonia.getText());
               cliente.setDireccion(direccion);
               cliente.setTelefono(txtTelefono.getText());
               Persona contacto = new Persona();
               contacto.setNombre(txtContacto.getText());
               cliente.setPersonaContacto(contacto);
               String elemento=cmbTipoPublicidad.getSelectedItem().toString();
               if(elemento.equals("Moda -Publicidad")){
                    String tipo= elemento.substring(0, elemento.indexOf(" -"));
                    cliente.setActividad(tipo);
               }
               else{
                   cliente.setActividad(elemento);
               }
               clienteBO.regsistrar(cliente);
           }
       }
       llenarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el cliente seleccionado?", "Cliente", JOptionPane.YES_NO_OPTION); 
        System.out.println(respuesta);
        if(respuesta == 0){
            Cliente cliente = new Cliente();
           cliente.setNombre(txtNombre.getText());
           Direccion direccion = new Direccion(txtCalle.getText(),txtNumero.getText(),txtColonia.getText());
           cliente.setDireccion(direccion);
           cliente.setTelefono(txtTelefono.getText());
           Persona contacto = new Persona();
           contacto.setNombre(txtContacto.getText());
           cliente.setPersonaContacto(contacto);
           String elemento=cmbTipoPublicidad.getSelectedItem().toString();
           if(elemento.equals("Moda -Publicidad")){
                String tipo= elemento.substring(0, elemento.indexOf(" -"));
                cliente.setActividad(tipo);
           }
           else{
               cliente.setActividad(elemento);
           }
            clienteBO.eliminar(cliente);
        }
        llenarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // Metodo para que solo se escriban letras
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

         if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
        if (txtNombre.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        // Metodo para que solo se escriban letras
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

         if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
        if (txtContacto.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

         if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
        if (txtCalle.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

         if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
        if (txtColonia.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // Metodo para que solo se pueda escribir numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (txtNumero.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
        String nombre = model.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
        String direccion = model.getValueAt(tablaClientes.getSelectedRow(), 1).toString();
        String telefono = model.getValueAt(tablaClientes.getSelectedRow(), 2).toString();
        String contacto = model.getValueAt(tablaClientes.getSelectedRow(), 3).toString();
        String tipo = model.getValueAt(tablaClientes.getSelectedRow(), 4).toString();
        String colonia = direccion.substring(direccion.indexOf("Colonia "));
        String numero = direccion.substring(direccion.indexOf(", "), direccion.indexOf(", Colonia "));
        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtContacto.setText(contacto);
        txtCalle.setText(direccion.substring(0, direccion.indexOf(",")));
        txtNumero.setText(numero.substring(2));
        txtColonia.setText(colonia.substring(8));
        if(tipo.equalsIgnoreCase("moda")){
            cmbTipoPublicidad.setSelectedIndex(1);
        }else{
            cmbTipoPublicidad.setSelectedIndex(2);
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (txtNumero.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        txtNombre.setText("");
        txtContacto.setText("");
        txtDireccion.setText("");
        txtCalle.setText("");
        txtTelefono.setText("");
        txtNumero.setText("");
        txtColonia.setText("");
        cmbTipoPublicidad.setSelectedIndex(0);
        
    }
/**
 *
 * Metodo para llenar la tabla
 */
    public void llenarTabla() {
        List<Cliente> productos = clienteBO.getCliente();
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        modelo.setRowCount(0);
        for (Cliente prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getNombre();
            fila[1] = prov.getDireccion().toString();
            fila[2] = prov.getTelefono();
            fila[3] = prov.getPersonaContacto().getNombre();
            fila[4] = prov.getActividad();
            modelo.addRow(fila);
        }

    }
    
/**
 *
 * Metodo para validar que esta vacio algún campo de texto
     * @return Regresa falso si hay un campo vacío, regresa verdadero si todos los campos están llenos
 */
    public boolean validarCampos(){
        if((txtNombre.getText().length() == 0)||(txtContacto.getText().length() == 0)||(txtCalle.getText().length() == 0)||
                (txtTelefono.getText().length() == 0)||(txtNumero.getText().length() == 0)||(txtColonia.getText().length() == 0)){
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Cliente", JOptionPane.ERROR_MESSAGE);           
            return false;
        }
        else{
            return true;
        }
    }
    
/**
 *
 * Metodo para validar que esté seleccionado un tipo de actividad
     * @return 
 */
    public boolean validarActividad(){
        if((cmbTipoPublicidad.getSelectedIndex() == 0)){
            JOptionPane.showMessageDialog(null, "Seleccione una actividad", "Cliente", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipoPublicidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
