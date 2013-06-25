/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pearson.Interface;

import com.pearson.SQL.Database;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author UMA99J5
 */
public class DatabaseConnectionInfoWindow extends javax.swing.JFrame {
    //public void windowClosed(WindowEvent e){
    //    dispose();
    // }

    /**
     * Creates new form NewMaskingSet
     */
    public DatabaseConnectionInfoWindow() {
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

        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        UserNameLabel = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        HostNameLabel = new javax.swing.JLabel();
        HostNameField = new javax.swing.JTextField();
        PortField = new javax.swing.JTextField();
        PortLabel = new javax.swing.JLabel();
        DefaultSchemaLabel = new javax.swing.JLabel();
        DefaultSchemaField = new javax.swing.JTextField();
        TestConnectionButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        ConnectionDetailsLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserNameLabel.setText("User Name:");

        PasswordLabel.setText("Password:");

        HostNameLabel.setText("Host Name:");

        HostNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HostNameFieldActionPerformed(evt);
            }
        });

        PortField.setText("3306");

        PortLabel.setText("Port:");

        DefaultSchemaLabel.setText("Default Schema:");

        DefaultSchemaField.setEditable(true);

        TestConnectionButton.setText("Test Connection");
        TestConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestConnectionButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButtonMouseExited(evt);
            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        ConnectionDetailsLabel.setText("Connection Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(ConnectionDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TestConnectionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(121, 121, 121)
                                .addComponent(OKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(PortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(HostNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(UserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(DefaultSchemaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordField)
                                    .addComponent(UserNameField)
                                    .addComponent(DefaultSchemaField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HostNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PortField, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(43, 43, 43)))
                        .addGap(78, 78, 78))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ConnectionDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(HostNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(HostNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(PortField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DefaultSchemaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(DefaultSchemaField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TestConnectionButton)
                    .addComponent(CancelButton)
                    .addComponent(OKButton))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HostNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HostNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HostNameFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // Close jFrame
       setVisible(false);
       //s.setDefaultCloseOperation(MainWindow.HIDE_ON_CLOSE);

    }//GEN-LAST:event_CancelButtonActionPerformed

    private void CancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonMouseExited

    private void TestConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestConnectionButtonActionPerformed
        String username = null;
        String password = null;
        String url = null;
        String defaultSchema;
        String port = null;

        for (int i = 0; i == 0; i++) {
            username = UserNameField.getText();
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the username");
                break;
            }

            password = PasswordField.getText();
            if (password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the password");
                break;
            }
            
            port = PortField.getText();
            if (port.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter port number");
                break;
            }

            url = HostNameField.getText();
            if (url.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the url");
                break;
            }

            defaultSchema = DefaultSchemaField.getText();
            if (defaultSchema.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the default schema");
                break;
            }

            if (Database.isConnectionValid(defaultSchema, username, password, "jdbc:mysql://" + url + ":" + port)) {
                JOptionPane.showMessageDialog(null, "Connection has been established");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Error - couldn't establish the connection. Please check setting above");
                break;
            }
        }
    }//GEN-LAST:event_TestConnectionButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        //test connection and open the createNewRuleWindow 
        setVisible(false);
        CreateNewRuleWindow rw = new CreateNewRuleWindow();
        
        rw.setVisible(true);
        rw.setDefaultCloseOperation(NewSubstitutionRuleWindow.HIDE_ON_CLOSE);
    }//GEN-LAST:event_OKButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DatabaseConnectionInfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseConnectionInfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseConnectionInfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseConnectionInfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseConnectionInfoWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ConnectionDetailsLabel;
    private javax.swing.JTextField DefaultSchemaField;
    private javax.swing.JLabel DefaultSchemaLabel;
    private javax.swing.JTextField HostNameField;
    private javax.swing.JLabel HostNameLabel;
    private javax.swing.JButton OKButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PortField;
    private javax.swing.JLabel PortLabel;
    private javax.swing.JButton TestConnectionButton;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
