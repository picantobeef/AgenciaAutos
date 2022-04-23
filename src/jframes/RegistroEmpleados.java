/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import configuraciones.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author scont
 */
public class RegistroEmpleados extends javax.swing.JFrame {

    ConexionBD con1 = new ConexionBD();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    /**
     * Creates new form RegistroEmpleados
     */
    public RegistroEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    void consultar() {
        String sql = "select * from empleado";
        try {
            conet = con1.conectado();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            Object[] empleado = new Object[10];
            modelo = (DefaultTableModel) jTableRegistroEmpleado.getModel();
            while (rs.next()) {
                empleado[0] = rs.getInt("id_empleado");
                empleado[1] = rs.getString("nombreCompleto");
                empleado[2] = rs.getString("cedula");
                empleado[3] = rs.getString("telefono");
                empleado[4] = rs.getString("direccion");
                empleado[5] = rs.getString("email");
                empleado[6] = rs.getFloat("salario");
                empleado[7] = rs.getString("departamento");
                empleado[8] = rs.getString("usuario");
                empleado[9] = rs.getString("contrasena");
                modelo.addRow(empleado);
            }
            jTableRegistroEmpleado.setModel(modelo);
        } catch (Exception E) {
        }
    }

    void agregar() {
        String nombreCompleto = jtfNombreCompleto.getText();
        String cedula = jtfCedula.getText();
        String telefono = jtfTelefono.getText();
        String direccion = jtfDireccion.getText();
        String email = jtfEmail.getText();
        String salario = jtfSalario.getText();
        String departamento = jtfDepartamento.getText();
        String usuario = jtfUsuario.getText();
        String contrasena = jtfContrasena.getText();

        try {

            if (nombreCompleto.equals("")
                    || cedula.equals("")
                    || telefono.equals("")
                    || direccion.equals("")
                    || email.equals("")
                    || salario.equals("")
                    || departamento.equals("")
                    || usuario.equals("")
                    || contrasena.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Faltan datos por ingresar", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
            } else {

                String sql = "insert into empleado(nombreCompleto,cedula,telefono,direccion,email,salario,departamento,usuario,contrasena) value('"
                        + nombreCompleto + "','"
                        + cedula + "','"
                        + telefono + "','"
                        + direccion + "','"
                        + email + "','"
                        + salario + "','"
                        + departamento + "','"
                        + usuario + "','"
                        + contrasena + "')";
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
        for (int i = 0; i < jTableRegistroEmpleado.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void modificar() {

        String nombreCompleto = jtfNombreCompleto.getText();
        String cedula = jtfCedula.getText();
        String telefono = jtfTelefono.getText();
        String direccion = jtfDireccion.getText();
        String email = jtfEmail.getText();
        String salario = jtfSalario.getText();
        String departamento = jtfDepartamento.getText();
        String usuario = jtfUsuario.getText();
        String contrasena = jtfContrasena.getText();

        try {
            if (nombreCompleto.equals("")
                    || cedula.equals("")
                    || telefono.equals("")
                    || direccion.equals("")
                    || email.equals("")
                    || salario.equals("")
                    || departamento.equals("")
                    || usuario.equals("")
                    || contrasena.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Faltan datos por ingresar", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
            } else {
                String sql = "UPDATE empleado SET consecutivo='" + idc
                        + "',nombreCompleto='" + nombreCompleto
                        + "',cedula='" + cedula
                        + "',telefono='" + telefono
                        + "',direccion='" + direccion
                        + "',email='" + email
                        + "',salario='" + salario
                        + "',departamento='" + departamento
                        + "',usuario='" + usuario
                        + "',contrasena='" + contrasena
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

    void eliminar() {
        int fila = jTableRegistroEmpleado.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(
                        null, "Debe seleccionar ");
                limpiarTabla();
            } else {
                String sql = "DELETE FROM empleado WHERE consecutivo=" + idc;
                conet = con1.conectado();
                st = conet.createStatement();
                st.execute(sql);
                JOptionPane.showMessageDialog(null,
                        "El registro del empleado fue eliminado",
                        "Eliminar",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
            }
        } catch (Exception e) {
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jlIdEmpleado = new javax.swing.JLabel();
        jlCedula = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jtfNombreCompleto = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jbIrARegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistroEmpleado = new javax.swing.JTable();
        jtfIdEmpleado = new javax.swing.JTextField();
        jlNombreCompleto = new javax.swing.JLabel();
        jlDepartamento = new javax.swing.JLabel();
        jtfDepartamento = new javax.swing.JTextField();
        jlSalario = new javax.swing.JLabel();
        jtfSalario = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfContrasena = new javax.swing.JTextField();
        jlContrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Hannotate TC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE EMPLEADOS");

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

        jlIdEmpleado.setText("Empleado #:");

        jlCedula.setText("Cedula:");

        jlDireccion.setText("Direccion:");

        jlTelefono.setText("Teléfono:");

        jlEmail.setText("Email:");

        jtfNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreCompletoActionPerformed(evt);
            }
        });

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
        jbAnterior.setText("Menú Empleados");
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

        jTableRegistroEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado Nro.", "Nombre Completo", "Cédula", "Teléfono", "Dirección", "E-mail", "Salario", "Departamento", "Usuario", "Contraseña"
            }
        ));
        jTableRegistroEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistroEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistroEmpleado);

        jtfIdEmpleado.setEditable(false);
        jtfIdEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfIdEmpleado.setForeground(new java.awt.Color(0, 153, 153));

        jlNombreCompleto.setText("Nombre Completo:");

        jlDepartamento.setText("Departamento:");

        jlSalario.setText("Salario:");

        jlUsuario.setText("Usuario:");

        jlContrasena.setText("Contraseña:");

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
                                            .addComponent(jlIdEmpleado)
                                            .addComponent(jlCedula)
                                            .addComponent(jlDireccion)
                                            .addComponent(jlTelefono)
                                            .addComponent(jlEmail)
                                            .addComponent(jlDepartamento)
                                            .addComponent(jlSalario)
                                            .addComponent(jlUsuario)
                                            .addComponent(jlContrasena))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jtfIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNombreCompleto)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfNombreCompleto)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlIdEmpleado))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombreCompleto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCedula)
                            .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDireccion)
                            .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTelefono)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEmail)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDepartamento)
                            .addComponent(jtfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario)
                            .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUsuario)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlContrasena)
                            .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // SALIR
        System.exit(0); // Para salir del programa en ejecucion.
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        agregar();
        consultar();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        modificar();
        consultar();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminar();
        consultar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnteriorActionPerformed
        //Vuelve al menu de Empleados
        MenuEmpleados atras = new MenuEmpleados();
        atras.show();
        this.dispose();
    }//GEN-LAST:event_jbAnteriorActionPerformed

    private void jbIrARegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrARegistroActionPerformed
//        ConsultarClientes consulta = new ConsultarClientes();
//        consulta.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jbIrARegistroActionPerformed

    private void jTableRegistroEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistroEmpleadoMouseClicked
        int fila = jTableRegistroEmpleado.getSelectedRow();
        if (fila == 1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            idc = Integer.parseInt((String) jTableRegistroEmpleado.getValueAt(fila, 0).toString());
            String nombreCompleto = (String) jTableRegistroEmpleado.getValueAt(fila, 1);
            String cedula = (String) jTableRegistroEmpleado.getValueAt(fila, 2);
            String telefono = (String) jTableRegistroEmpleado.getValueAt(fila, 3);
            String direccion = (String) jTableRegistroEmpleado.getValueAt(fila, 4);
            String email = (String) jTableRegistroEmpleado.getValueAt(fila, 5);
            Float salario = (Float) jTableRegistroEmpleado.getValueAt(fila, 6);
            String departamento = (String) jTableRegistroEmpleado.getValueAt(fila, 7);
            String usuario = (String) jTableRegistroEmpleado.getValueAt(fila, 8);
            String contrasena = (String) jTableRegistroEmpleado.getValueAt(fila, 9);
            //            int edad = Integer.parseInt((String) jTableRegistroClientes.getValueAt(fila, 6).toString());
            jtfIdEmpleado.setText("" + idc);
            jtfNombreCompleto.setText(nombreCompleto);
            jtfCedula.setText(cedula);
            jtfTelefono.setText(telefono);
            jtfDireccion.setText(telefono);
            jtfEmail.setText("" + email);
            jtfSalario.setText("" + salario);
            jtfDepartamento.setText("" + departamento);
            jtfUsuario.setText("" + usuario);
            jtfContrasena.setText("" + contrasena);
            jtfIdEmpleado.requestFocus();
        }
    }//GEN-LAST:event_jTableRegistroEmpleadoMouseClicked

    private void jtfNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreCompletoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistroEmpleado;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbIrARegistro;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlContrasena;
    private javax.swing.JLabel jlDepartamento;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlIdEmpleado;
    private javax.swing.JLabel jlNombreCompleto;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfDepartamento;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfIdEmpleado;
    private javax.swing.JTextField jtfNombreCompleto;
    private javax.swing.JTextField jtfSalario;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
