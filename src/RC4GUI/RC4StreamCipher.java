/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RC4GUI;

import RC4.RC4;
import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author fariz.ikhwantri -1106002330
 * @author muhammad.hanif.naufal - 1106053653
 */
public class RC4StreamCipher extends javax.swing.JFrame {

    public File plaintextFile;
    public File ciphertextFile;
    public File keyEncriptFile;
    public File keyDecryptFile;
    public RC4 rc4;

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
        encryptionButton = new javax.swing.JButton();
        PlaintextLabel = new javax.swing.JLabel();
        KeyEncryptLabel = new javax.swing.JLabel();
        KeyEncryptButton = new javax.swing.JButton();
        plaintextButton = new javax.swing.JButton();
        copyrightLabelEnkripsi = new javax.swing.JLabel();
        DecryptionPanel = new javax.swing.JPanel();
        CiphertextLabel = new javax.swing.JLabel();
        keyDecryptLabel = new javax.swing.JLabel();
        ciphertextButton = new javax.swing.JButton();
        keyDecryptButton = new javax.swing.JButton();
        decryptionButton = new javax.swing.JButton();
        CopyrightLabelDekripsi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encryptionButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        encryptionButton.setText("Encrypt");
        encryptionButton.setInheritsPopupMenu(true);
        encryptionButton.setName(""); // NOI18N
        encryptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionButtonActionPerformed(evt);
            }
        });

        PlaintextLabel.setText("Input plaintext file");
        PlaintextLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        KeyEncryptLabel.setText("Input key file");
        KeyEncryptLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        KeyEncryptButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        KeyEncryptButton.setText("Input Key");
        KeyEncryptButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        KeyEncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyEncryptButtonActionPerformed(evt);
            }
        });

        plaintextButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        plaintextButton.setText("Input Plaintext");
        plaintextButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        plaintextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plaintextButtonActionPerformed(evt);
            }
        });

        copyrightLabelEnkripsi.setText("@author : Fariz Ikhwantri & Muhammad Hanif N");

        javax.swing.GroupLayout EncryptionPanelLayout = new javax.swing.GroupLayout(EncryptionPanel);
        EncryptionPanel.setLayout(EncryptionPanelLayout);
        EncryptionPanelLayout.setHorizontalGroup(
            EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encryptionButton)
                    .addGroup(EncryptionPanelLayout.createSequentialGroup()
                        .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlaintextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(KeyEncryptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plaintextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KeyEncryptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(77, 77, 77))
            .addGroup(EncryptionPanelLayout.createSequentialGroup()
                .addComponent(copyrightLabelEnkripsi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EncryptionPanelLayout.setVerticalGroup(
            EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlaintextLabel)
                    .addComponent(plaintextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KeyEncryptLabel)
                    .addComponent(KeyEncryptButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(copyrightLabelEnkripsi))
        );

        jTabbedPane1.addTab("RC4 Encryption", EncryptionPanel);

        CiphertextLabel.setText("Input ciphertext file");
        CiphertextLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        keyDecryptLabel.setText("Input key file");
        keyDecryptLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ciphertextButton.setText("Input Ciphertext");
        ciphertextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciphertextButtonActionPerformed(evt);
            }
        });

        keyDecryptButton.setText("Input Key");
        keyDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyDecryptButtonActionPerformed(evt);
            }
        });

        decryptionButton.setText("Decrypt");
        decryptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionButtonActionPerformed(evt);
            }
        });

        CopyrightLabelDekripsi.setText("@author : Fariz Ikhwantri & Muhammad Hanif N");

        javax.swing.GroupLayout DecryptionPanelLayout = new javax.swing.GroupLayout(DecryptionPanel);
        DecryptionPanel.setLayout(DecryptionPanelLayout);
        DecryptionPanelLayout.setHorizontalGroup(
            DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decryptionButton)
                    .addGroup(DecryptionPanelLayout.createSequentialGroup()
                        .addGroup(DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CiphertextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(keyDecryptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ciphertextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keyDecryptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(DecryptionPanelLayout.createSequentialGroup()
                .addComponent(CopyrightLabelDekripsi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DecryptionPanelLayout.setVerticalGroup(
            DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiphertextLabel)
                    .addComponent(ciphertextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DecryptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyDecryptLabel)
                    .addComponent(keyDecryptButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(CopyrightLabelDekripsi))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionButtonActionPerformed
        Enkripsi(plaintextFile, keyEncriptFile);
    }//GEN-LAST:event_encryptionButtonActionPerformed

    private void plaintextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plaintextButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            FileFilter filter = new FileNameExtensionFilter("Text File", "txt");
            fc.setFileFilter(filter);
            File file = fc.getSelectedFile();
            if (file == null) {
                JOptionPane.showMessageDialog(this, "Tipe file harus berupa text file (.txt)", "Input Salah", JOptionPane.ERROR_MESSAGE);
            } else {
                String filename = file.getAbsolutePath();
                PlaintextLabel.setText(filename);
                this.plaintextFile = file;
            }
        }
    }//GEN-LAST:event_plaintextButtonActionPerformed

    private void KeyEncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyEncryptButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            FileFilter filter = new FileNameExtensionFilter("Text File", "txt");
            fc.setFileFilter(filter);
            File file = fc.getSelectedFile();
            if (file == null) {
                JOptionPane.showMessageDialog(this, "Tipe file harus berupa text file (.txt)", "Input Salah", JOptionPane.ERROR_MESSAGE);
            } else {
                String filename = file.getAbsolutePath();
                KeyEncryptLabel.setText(filename);
                this.keyEncriptFile = file;
            }
        }
    }//GEN-LAST:event_KeyEncryptButtonActionPerformed

    private void ciphertextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciphertextButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            FileFilter filter = new FileNameExtensionFilter("Text File", "txt");
            fc.setFileFilter(filter);
            File file = fc.getSelectedFile();
            if (file == null) {
                JOptionPane.showMessageDialog(this, "Tipe file harus berupa text file (.txt)", "Input Salah", JOptionPane.ERROR_MESSAGE);
            } else {
                String filename = file.getAbsolutePath();
                CiphertextLabel.setText(filename);
                this.ciphertextFile = file;
            }
        }

    }//GEN-LAST:event_ciphertextButtonActionPerformed

    private void keyDecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyDecryptButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int ret = fc.showOpenDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            FileFilter filter = new FileNameExtensionFilter("Text File", "txt");
            fc.setFileFilter(filter);
            File file = fc.getSelectedFile();
            if (file == null) {
                JOptionPane.showMessageDialog(this, "Tipe file harus berupa text file (.txt)", "Input Salah", JOptionPane.ERROR_MESSAGE);
            } else {
                String filename = file.getAbsolutePath();
                keyDecryptLabel.setText(filename);
                this.keyDecryptFile = file;
            }
        }
    }//GEN-LAST:event_keyDecryptButtonActionPerformed

    private void decryptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionButtonActionPerformed
        Dekripsi(ciphertextFile, keyDecryptFile);
    }//GEN-LAST:event_decryptionButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                RC4StreamCipher window = new RC4StreamCipher();
                window.setTitle("RC4 Application");
                window.setVisible(true);
            }
        });
    }

    public void Enkripsi(File text, File key){
        doRC4(text, key, new File("Tabel-S-Enkripsi.txt"), new File("Ciphertext.txt"),0);
    }
    
    public void Dekripsi(File text, File key){
        doRC4(text, key, new File("Tabel-S-Dekripsi.txt"), new File("Plaintext.txt"),1);
    }
    
    public void doRC4(File text, File key, File out1, File out2,int status) {
        // TODO add your handling code here:
        if (text == null && key == null) {
            JOptionPane.showMessageDialog(this, "Input file belum lengkap", "Input belum lengkap", JOptionPane.ERROR_MESSAGE);
            return;
        }
        byte[] keyByte;
        byte[] plainByte;
        //Handle input key
        try {
            keyByte = Files.readAllBytes(key.toPath());
            if (keyByte.length < 16 || keyByte.length > 256) {
                JOptionPane.showMessageDialog(this, "Key harus berukuran 16 - 256 byte", "Kesalahan panjang input key ", JOptionPane.ERROR_MESSAGE);
                return;
            }
            plainByte = Files.readAllBytes(text.toPath());
            rc4 = new RC4(keyByte);
            BufferedWriter writer = new BufferedWriter(new FileWriter(out1));
            byte S[] = rc4.getS();
            writer.append("Tabel S sesudah permutasi awal : ");
            writer.newLine();
            for (int i = 0; i < S.length; i++) {
                writer.append(String.format("%02X ", S[i]));
                if (i % 10 == 9) {
                    writer.newLine();
                }
            }
            writer.newLine();
            writer.newLine();
            byte cipherText[] = rc4.encrypt(plainByte);
            if(status == 0){
                writer.append("Tabel S sesudah enkripsi: ");
                writer.newLine();
            }else{
                writer.append("Tabel S sesudah dekripsi : ");
                writer.newLine();
            }
            
            S = rc4.getS();
            for (int i = 0; i < S.length; i++) {
                writer.append(String.format("%02X ", S[i]));
                if (i % 10 == 9) {
                    writer.newLine();
                }
            }
            writer.newLine();
            writer.flush();
            writer.close();

            //write output2
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(out2));
            bos.write(cipherText);
            bos.flush();
            bos.close();
            
            if(status == 0){
                JOptionPane.showMessageDialog(this, "Enkripsi telah selesai", "Finish", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Dekripsi telah selesai", "Finish", JOptionPane.INFORMATION_MESSAGE);
            }
            openFile(out1);
            openFile(out2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void openFile(File file) {
        if (!Desktop.isDesktopSupported()) {
            System.err.println("Desktop not supported");
        }

        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.EDIT)) {
            System.err.println("EDIT not supported");
        }

        try {
            desktop.edit(new File(file.getAbsolutePath()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CiphertextLabel;
    private javax.swing.JLabel CopyrightLabelDekripsi;
    private javax.swing.JPanel DecryptionPanel;
    private javax.swing.JPanel EncryptionPanel;
    private javax.swing.JButton KeyEncryptButton;
    private javax.swing.JLabel KeyEncryptLabel;
    private javax.swing.JLabel PlaintextLabel;
    private javax.swing.JButton ciphertextButton;
    private javax.swing.JLabel copyrightLabelEnkripsi;
    private javax.swing.JButton decryptionButton;
    private javax.swing.JButton encryptionButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton keyDecryptButton;
    private javax.swing.JLabel keyDecryptLabel;
    private javax.swing.JButton plaintextButton;
    // End of variables declaration//GEN-END:variables
}
