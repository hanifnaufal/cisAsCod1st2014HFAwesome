/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RC4GUI;

/**
 *
 * @author fariz.ikhwantri
 */
public class RC4StreamCipher extends javax.swing.JFrame {

    /**
     * Creates new form RC4StreamChipher
     */
    public RC4StreamCipher() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        EncryptionPanel = new javax.swing.JPanel();
        Plaintext = new javax.swing.JFormattedTextField();
        KeyInputText = new javax.swing.JFormattedTextField();
        EncryptionButton = new javax.swing.JButton();
        PlaintextLabel = new javax.swing.JLabel();
        KeyLabel = new javax.swing.JLabel();
        DecryptionPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Plaintext.setText("Input a file....");
        Plaintext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaintextMouseClicked(evt);
            }
        });
        Plaintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaintextActionPerformed(evt);
            }
        });

        KeyInputText.setText("Input a file.....");
        KeyInputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyInputTextActionPerformed(evt);
            }
        });

        EncryptionButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        EncryptionButton.setText("Encrypt");
        EncryptionButton.setInheritsPopupMenu(true);
        EncryptionButton.setName(""); // NOI18N
        EncryptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionButtonActionPerformed(evt);
            }
        });

        PlaintextLabel.setText("Plaintext");

        KeyLabel.setText("Key");

        javax.swing.GroupLayout EncryptionPanelLayout = new javax.swing.GroupLayout(EncryptionPanel);
        EncryptionPanel.setLayout(EncryptionPanelLayout);
        EncryptionPanelLayout.setHorizontalGroup(
            EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlaintextLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KeyLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KeyInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncryptionPanelLayout.createSequentialGroup()
                        .addComponent(Plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(EncryptionButton)))
                .addGap(77, 77, 77))
        );
        EncryptionPanelLayout.setVerticalGroup(
            EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EncryptionButton)
                    .addComponent(PlaintextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KeyInputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeyLabel))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RC4 Encryption", EncryptionPanel);

        javax.swing.GroupLayout DecryptionPanelLayout = new javax.swing.GroupLayout(DecryptionPanel);
        DecryptionPanel.setLayout(DecryptionPanelLayout);
        DecryptionPanelLayout.setHorizontalGroup(
            DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        DecryptionPanelLayout.setVerticalGroup(
            DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("RC4 Decryption", DecryptionPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaintextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PlaintextActionPerformed

    private void PlaintextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaintextMouseClicked
        // TODO add your handling code here:
        java.awt.FileDialog plainText = new java.awt.FileDialog(this, "Plaintext path here");
        String path = plainText.getFile();
    }//GEN-LAST:event_PlaintextMouseClicked

    private void KeyInputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyInputTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeyInputTextActionPerformed

    private void EncryptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EncryptionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RC4StreamCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RC4StreamCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RC4StreamCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RC4StreamCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RC4StreamCipher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DecryptionPanel;
    private javax.swing.JButton EncryptionButton;
    private javax.swing.JPanel EncryptionPanel;
    private javax.swing.JFormattedTextField KeyInputText;
    private javax.swing.JLabel KeyLabel;
    private javax.swing.JFormattedTextField Plaintext;
    private javax.swing.JLabel PlaintextLabel;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
