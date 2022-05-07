/*
 * FrmMenu.java
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
public class FrmMenu extends javax.swing.JFrame {
    public FrmMenu() {
        initComponents();
        centrarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCasting = new javax.swing.JMenuItem();
        menuRegistrarPerfil = new javax.swing.JMenuItem();
        menuRegistrarCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuBuscarCasting = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuInfoEquipo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - Casting");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoCasting.png"))); // NOI18N
        lblLogo.setMaximumSize(new java.awt.Dimension(677, 631));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jMenu1.setText("Nuevo");

        menuCasting.setText("Registrar Casting");
        menuCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCastingActionPerformed(evt);
            }
        });
        jMenu1.add(menuCasting);

        menuRegistrarPerfil.setText("Registrar Perfil");
        menuRegistrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarPerfilActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarPerfil);

        menuRegistrarCliente.setText("Registrar Cliente");
        menuRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarCliente);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Buscar");

        menuBuscarCasting.setText("Buscar Casting");
        menuBuscarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarCastingActionPerformed(evt);
            }
        });
        jMenu3.add(menuBuscarCasting);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ayuda");

        menuInfoEquipo.setText("Información");
        menuInfoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoEquipoActionPerformed(evt);
            }
        });
        jMenu2.add(menuInfoEquipo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarClienteActionPerformed
         FrmRegistrarCliente frmRegCliente = new FrmRegistrarCliente();
        frmRegCliente.setVisible(true);
        
    }//GEN-LAST:event_menuRegistrarClienteActionPerformed

    private void menuInfoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoEquipoActionPerformed
        JOptionPane.showMessageDialog(this, "Este proyecto fue realizado por \nAlexandra Iveth Rodriguez Castellanos - 229949\nIsaac Castelo Valenzuela - 216823\nSaul Armando Reyna Lopez - 229256\nDiseño de Software", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuInfoEquipoActionPerformed

    private void menuCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCastingActionPerformed
        FrmRegistrarCasting frmRegCasting = new FrmRegistrarCasting();
        frmRegCasting.setVisible(true);
    }//GEN-LAST:event_menuCastingActionPerformed

    private void menuRegistrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarPerfilActionPerformed
        FrmRegistrarPerfil frmRegPerfil = new FrmRegistrarPerfil();
        frmRegPerfil.setVisible(true);
    }//GEN-LAST:event_menuRegistrarPerfilActionPerformed

    private void menuBuscarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarCastingActionPerformed
        FrmBuscarCasting frmBuscarCasting = new FrmBuscarCasting();
        frmBuscarCasting.setVisible(true);
    }//GEN-LAST:event_menuBuscarCastingActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
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
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenuItem menuBuscarCasting;
    private javax.swing.JMenuItem menuCasting;
    private javax.swing.JMenuItem menuInfoEquipo;
    private javax.swing.JMenuItem menuRegistrarCliente;
    private javax.swing.JMenuItem menuRegistrarPerfil;
    // End of variables declaration//GEN-END:variables
}
