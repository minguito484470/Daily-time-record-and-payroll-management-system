
package com.Forms;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.Timer;
import javax.swing.UIManager;

public class FlashScreen extends javax.swing.JFrame {

    private Timer timer;
    private int progressValue = 0;

    void progressBarAction() {
        timer = new Timer(10, e -> {
            if (progressValue < 100) {
                progressValue++;
                progressBar.setValue(progressValue);
            } else {
                timer.stop();
                dispose();
                new LoginForm().setVisible(true);
            }
        });
        timer.start();
    }

    public FlashScreen() {
        initComponents();
        progressBarAction();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(55, 126, 249));
        progressBar.setBorder(null);
        progressBar.setOpaque(true);
        progressBar.setRequestFocusEnabled(false);
        progressBar.setStringPainted(true);
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 350, 20));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/splashform-background.png"))); // NOI18N
        jPanel1.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
