/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gaysx
 */
public class principal1 extends javax.swing.JFrame implements ActionListener {

    Menu panel1 = new Menu();
    panel2 panel2 = new panel2();

    public principal1() {
        initComponents();

        contenedor.add(panel1);
        panel1.setVisible(true);
        panel2.setVisible(false);

        desabilitarbotenes();

        jbanterior.addActionListener(this);
        jbsiguente.addActionListener(this);

    }

    private void desabilitarbotenes() {
        if (panel1.isVisible()) {
            jbanterior.setEnabled(false);
            jbsiguente.setEnabled(true);
        } else if (panel2.isVisible()) {
            jbanterior.setEnabled(true);
            jbsiguente.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbanterior = new javax.swing.JButton();
        jbsiguente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setLayout(new java.awt.BorderLayout());

        jbanterior.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbanterior.setText("Anterior");
        jPanel1.add(jbanterior);

        jbsiguente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbsiguente.setText("Siguiente");
        jbsiguente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jbsiguente);

        contenedor.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbanterior;
    private javax.swing.JButton jbsiguente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object evt = ae.getSource();

        if (evt.equals(jbanterior)) {
            panel2.setVisible(false);
            panel1.setVisible(true);

            contenedor.add(panel1);

            contenedor.validate();
            desabilitarbotenes();
        } else if (evt.equals(jbsiguente)) {
            panel2.setVisible(true);
            panel1.setVisible(false);

            contenedor.add(panel2);

            contenedor.validate();
            desabilitarbotenes();
        }
    }

}
