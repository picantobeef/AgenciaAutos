package jframes;

import configuraciones.HilosLoadingScreen;
import jframes.Login;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este jframe tiene como funcion simular una aplicacion cuando esta cargando
 * @author scont version 12 abr. 2022
 */
public class LoadingScreen extends javax.swing.JFrame {

    HilosLoadingScreen h = new HilosLoadingScreen(); //aqui se crea la instancia de la clase HilosLoadingScreen

    /**
     * Creates new form LoadingScreen
     */
    public LoadingScreen() {
        initComponents();
        setLocationRelativeTo(null);
        h.recibeJTextField(jtfCargando); //aqui el text field recibe el contador para mostrarlo en pantalla

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlImagen = new javax.swing.JLabel();
        jpbProgreso = new javax.swing.JProgressBar();
        jtfCargando = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenLoadingScreen.jpg"))); // NOI18N

        jpbProgreso.setBackground(new java.awt.Color(204, 204, 204));
        jpbProgreso.setForeground(new java.awt.Color(0, 153, 153));
        jpbProgreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtfCargando.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCargando.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCargando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCargandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlImagen)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpbProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jtfCargando, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpbProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCargando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        h.start(); //aqui se inicia el hilo del contador que sale en la pantalla
    }//GEN-LAST:event_formWindowOpened

    private void jtfCargandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCargandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCargandoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*este codigo maneja el hilo de la barra de carga
        se crea la instancia
        se hace visible la pantallita
        el for tiene un iterador i, se encarga de incrementar para ir moviendo la barra de color
        el Thread.sleep se mueve cada 50 milisegundos
        la barra de progreso de la pantallita 'cargando' se va llenando a como ncremente el i
         */
        LoadingScreen cargando = new LoadingScreen();
        cargando.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                cargando.jpbProgreso.setValue(i);
            }

        } catch (InterruptedException ex) { //esta excepcion es automatica y pertenece al metodo sleep()
            Logger.getLogger(HilosLoadingScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Login().setVisible(true);
        cargando.dispose(); //cierra la pantalla de carga
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JProgressBar jpbProgreso;
    private javax.swing.JTextField jtfCargando;
    // End of variables declaration//GEN-END:variables
}
