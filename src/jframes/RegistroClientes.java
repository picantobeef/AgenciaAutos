package jframes;

import configuraciones.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class RegistroClientes extends javax.swing.JFrame {

    ConexionBD con1 = new ConexionBD();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public RegistroClientes() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();

    }

    void consultar() {
        String sql = "select * from cliente";
        try {
            conet = con1.conectado();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            Object[] cliente = new Object[6];
            modelo = (DefaultTableModel) jTableRegistroClientes.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("consecutivo");
                cliente[1] = rs.getString("nombreCompleto");
                cliente[2] = rs.getString("cedula");
                cliente[3] = rs.getString("direccion");
                cliente[4] = rs.getString("celular");
                cliente[5] = rs.getString("email");
                modelo.addRow(cliente);
            }
            jTableRegistroClientes.setModel(modelo);
        } catch (Exception E) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jlNumeroCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNombreCompleto = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jbIrARegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistroClientes = new javax.swing.JTable();
        jtfConsecutivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Hannotate TC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE CLIENTES");

        jbSalir.setBackground(new java.awt.Color(0, 102, 102));
        jbSalir.setText("X");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jlNumeroCliente.setText("Cliente #:");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Email:");

        jbAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jbAgregar.setForeground(new java.awt.Color(0, 102, 102));
        jbAgregar.setText("AGREGAR");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbModificar.setForeground(new java.awt.Color(0, 102, 102));
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setForeground(new java.awt.Color(0, 102, 102));
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbAnterior.setBackground(new java.awt.Color(0, 102, 102));
        jbAnterior.setText("Menú Clientes");
        jbAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnteriorActionPerformed(evt);
            }
        });

        jbIrARegistro.setBackground(new java.awt.Color(255, 255, 255));
        jbIrARegistro.setForeground(new java.awt.Color(0, 102, 102));
        jbIrARegistro.setText("Ir a REGISTRO");
        jbIrARegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrARegistroActionPerformed(evt);
            }
        });

        jTableRegistroClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consecutivo", "Nombre Completo", "Cédula", "Dirección", "Teléfono", "E-mail"
            }
        ));
        jTableRegistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistroClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistroClientes);

        jtfConsecutivo.setEditable(false);
        jtfConsecutivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfConsecutivo.setForeground(new java.awt.Color(0, 153, 153));

        jLabel8.setText("Nombre Completo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbIrARegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNumeroCliente)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                            .addComponent(jtfCelular)
                                            .addComponent(jtfEmail)
                                            .addComponent(jtfDireccion)
                                            .addComponent(jtfConsecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfNombreCompleto)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfConsecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNumeroCliente))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar)
                            .addComponent(jbModificar)
                            .addComponent(jbEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIrARegistro)
                    .addComponent(jbAnterior))
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
    }// </editor-fold>//GEN-END:initComponents


    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        agregar();
        consultar();
    }//GEN-LAST:event_jbAgregarActionPerformed

    void agregar() {
        String nombreCompleto = jtfNombreCompleto.getText();
        String cedula = jtfCedula.getText();
        String direccion = jtfDireccion.getText();
        String celular = jtfCelular.getText();
        String email = jtfEmail.getText();

        try {

            if (nombreCompleto.equals("")
                    || cedula.equals("")
                    || direccion.equals("")
                    || celular.equals("")
                    || email.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Faltan datos por ingresar", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
            } else {

                String sql = "insert into cliente(nombreCompleto,cedula,direccion,celular,email) value('"
                        + nombreCompleto + "','"
                        + cedula + "','"
                        + direccion + "','"
                        + celular + "','"
                        + email + "')";
                conet = con1.conectado();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(
                        null,
                        "Se creo un nuevo registro", "Exitoso",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
            }
        } catch (Exception e) {
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < jTableRegistroClientes.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }


    private void jbIrARegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrARegistroActionPerformed
        ConsultarClientes consulta = new ConsultarClientes();
        consulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbIrARegistroActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // SALIR
        System.exit(0); // Para salir del programa en ejecucion.
    }//GEN-LAST:event_jbSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiarTabla();
        consultar();
    }//GEN-LAST:event_formWindowOpened

    private void jbAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnteriorActionPerformed
        //Vuelve al menu de Clientes
        MenuClientes atras = new MenuClientes();
        atras.show();
        this.dispose();
    }//GEN-LAST:event_jbAnteriorActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        modificar();
        consultar();
    }//GEN-LAST:event_jbModificarActionPerformed
    void modificar() {

        String nombreCompleto = jtfNombreCompleto.getText();
        String cedula = jtfCedula.getText();
        String direccion = jtfDireccion.getText();
        String celular = jtfCelular.getText();
        String email = jtfEmail.getText();

        try {
            if (nombreCompleto.equals("")
                    || cedula.equals("")
                    || direccion.equals("")
                    || celular.equals("")
                    || email.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Faltan datos por ingresar", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
            } else {
                String sql = "UPDATE cliente SET consecutivo='" + idc
                        + "',nombreCompleto='" + nombreCompleto
                        + "',cedula='" + cedula
                        + "',direccion='" + direccion
                        + "',celular='" + celular
                        + "',email='" + email
                        + "'WHERE consecutivo=" + idc;
                conet = con1.conectado();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(
                        null,
                        "El registro fue actualizado", "Exitoso",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
            }
        } catch (Exception e) {
        }
    }

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminar();
        consultar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jTableRegistroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistroClientesMouseClicked
        int fila = jTableRegistroClientes.getSelectedRow();
        if (fila == 1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            idc = Integer.parseInt((String) jTableRegistroClientes.getValueAt(fila, 0).toString());
            String nombreCompleto = (String) jTableRegistroClientes.getValueAt(fila, 1);
            String cedula = (String) jTableRegistroClientes.getValueAt(fila, 2);
            String direccion = (String) jTableRegistroClientes.getValueAt(fila, 3);
            String celular = (String) jTableRegistroClientes.getValueAt(fila, 4);
            String email = (String) jTableRegistroClientes.getValueAt(fila, 5);
//            int edad = Integer.parseInt((String) jTableRegistroClientes.getValueAt(fila, 6).toString());
            jtfConsecutivo.setText("" + idc);
            jtfNombreCompleto.setText(nombreCompleto);
            jtfCedula.setText(cedula);
            jtfCelular.setText(celular);
            jtfEmail.setText("" + email);            
            jtfConsecutivo.requestFocus();
        }

    }//GEN-LAST:event_jTableRegistroClientesMouseClicked

    void eliminar() {
        int fila = jTableRegistroClientes.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar ");
                limpiarTabla();
            } else {
                String sql = "DELETE FROM cliente WHERE consecutivo=" + idc;
                conet = con1.conectado();
                st = conet.createStatement();
                st.execute(sql);
                JOptionPane.showMessageDialog(null,
                        "El registro del cliente fue eliminado",
                        "Eliminar",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
            }
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientes().setVisible(true);
                //CargarDatos();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistroClientes;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbIrARegistro;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlNumeroCliente;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfConsecutivo;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombreCompleto;
    // End of variables declaration//GEN-END:variables
}
