/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Configuracion.CambioServidor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Correo extends javax.swing.JFrame {

    String tipoCorreo;

    /**
     * Creates new form Correo
     */
    public Correo() {
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
        Usuariotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DestinatarioTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Asuntotxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensajetxt = new javax.swing.JTextArea();
        EnviarBtn = new javax.swing.JButton();
        listaCorreos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Contratxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 100, -1));

        jLabel2.setText("Contrasena");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariotxtActionPerformed(evt);
            }
        });
        getContentPane().add(Usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 216, -1));

        jLabel3.setText("Asunto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, -1, -1));

        DestinatarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinatarioTxtActionPerformed(evt);
            }
        });
        getContentPane().add(DestinatarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 216, -1));

        jLabel4.setText("Destinatario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        Asuntotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsuntotxtActionPerformed(evt);
            }
        });
        getContentPane().add(Asuntotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 221, -1));

        Mensajetxt.setColumns(20);
        Mensajetxt.setRows(5);
        jScrollPane1.setViewportView(Mensajetxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 550, 240));

        EnviarBtn.setText("Enviar");
        EnviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EnviarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        listaCorreos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gmail", "Outlook" }));
        getContentPane().add(listaCorreos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel5.setText("Tipo de Correo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        Contratxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratxtActionPerformed(evt);
            }
        });
        getContentPane().add(Contratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DestinatarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinatarioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinatarioTxtActionPerformed

    private void EnviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBtnActionPerformed
        try {
            tipoCorreo = listaCorreos.getSelectedItem().toString();
            String usuario = Usuariotxt.getText();
            String contra = Contratxt.getText();
            String tipoCorreo = (String) listaCorreos.getSelectedItem();
            String destinatario = DestinatarioTxt.getText();
            String mensaje = Mensajetxt.getText();
            String asunto = Asuntotxt.getText();
            
           
            if (asunto.isEmpty()) {
                asunto = "sin asunto";
            }
            if (usuario.isEmpty() || contra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "usuario, contrasena   no pueden estar vacíos");
                return;
            }
            if (destinatario.isEmpty() || mensaje.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Destinatario y mensaje no pueden estar vacíos");
                return;
            }
            if(!validarCorreo(usuario, tipoCorreo.toLowerCase())){
                JOptionPane.showMessageDialog(this, "El usuario no coincide con el tipo");
                return;
                 }
            CambioServidor c = new CambioServidor();
            c.setTipoCorreo(tipoCorreo);
            EnviarCorreo i = c.getTipoCorreo();
            i.enviarCorreo(usuario, contra, destinatario, mensaje, asunto);
            JOptionPane.showMessageDialog(this, "Correo enviado exitosamente!");
        } catch (Exception ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EnviarBtnActionPerformed

    private boolean validarCorreo(String correo, String tipoCorreo) {
        if (correo.contains(tipoCorreo) || correo.contains("potros.itson.edu.mx")) {
            return true;
        }
        return false;
    }

    private void UsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariotxtActionPerformed

    private void AsuntotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsuntotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsuntotxtActionPerformed

    private void ContratxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Asuntotxt;
    private javax.swing.JPasswordField Contratxt;
    private javax.swing.JTextField DestinatarioTxt;
    private javax.swing.JButton EnviarBtn;
    private javax.swing.JTextArea Mensajetxt;
    private javax.swing.JTextField Usuariotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaCorreos;
    // End of variables declaration//GEN-END:variables
}
