/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.control;
import tiendaa.datos.usuario;
import tiendaa.metodousu;

/**
 *
 * @author USUARIO
 */
public class registrousu extends javax.swing.JFrame {
    

    /**
     * Creates new form registrousu
     */
    public registrousu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tUsuario = new javax.swing.JTextField();
        tPassword = new javax.swing.JPasswordField();
        tTelefono = new javax.swing.JTextField();
        btRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));
        getContentPane().add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 220, 30));
        getContentPane().add(tDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 220, 30));
        getContentPane().add(tUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 220, 30));
        getContentPane().add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 220, 30));
        getContentPane().add(tTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, 30));

        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(registrousu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrousu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrousu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrousu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        usuario user = new usuario ();
        login log = new login ();
        registrousu reg = new registrousu ();
        control con=new control(log,reg,user);
        reg.setVisible(true);
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrousu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField tDireccion;
    public javax.swing.JTextField tNombre;
    public javax.swing.JPasswordField tPassword;
    public javax.swing.JTextField tTelefono;
    public javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
    
    public Object gettNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
