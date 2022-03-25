/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class panel1 extends javax.swing.JPanel {

   
    public panel1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbsalir = new javax.swing.JButton();
        lbverinventario = new javax.swing.JButton();
        jbfacturacion = new javax.swing.JButton();
        jbclientes = new javax.swing.JButton();
        jbregistroempleados = new javax.swing.JButton();
        jbclientesmenbrecias = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Panel 1 ");

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        lbverinventario.setText("Iventario de autos ");
        lbverinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbverinventarioActionPerformed(evt);
            }
        });

        jbfacturacion.setText("Facturacion");
        jbfacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfacturacionActionPerformed(evt);
            }
        });

        jbclientes.setText("Clientes");
        jbclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclientesActionPerformed(evt);
            }
        });

        jbregistroempleados.setText("Registro empleado ");
        jbregistroempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistroempleadosActionPerformed(evt);
            }
        });

        jbclientesmenbrecias.setText("Clientes con membrecia VIP ");
        jbclientesmenbrecias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclientesmenbreciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbregistroempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbclientesmenbrecias))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbverinventario)
                        .addGap(33, 33, 33)
                        .addComponent(jbfacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbclientes)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbfacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbverinventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbregistroempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbclientesmenbrecias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbsalirActionPerformed

    private void lbverinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbverinventarioActionPerformed
           List<Autos> vehiculo = new ArrayList();
Autos vehiculo1 = new Motocicletas("2255", "Honda", "CRF 250 ",
                "Rojo ", "1999", "Manual ",
                "Exelente", 100.01, 250000.01,
                "Muy economico", "Sencilla", "150cc", "1 aciento",
                "1 piston");
        Autos vehiculo2 = new TodoTerreno("88774455", "Izuzu", "DMAX 4X4 ",
                "Verde  ", "2015", "Manual ", "Exelente",
                30000.44, 15000.55, "Alto", "Truck",
                "4500cc", "2 acientos ", "1200 caballos");
        Autos vehiculo3 = new Pickup("256032", "Mitsubishi", "L200 ",
                "Cafe  ", "2005", "Automatico ", "Bueno",
                15000.44, 250000.55, "Alta", "Dual",
                "3500cc", " 3 acientos ", "2 cabinas ");
        Autos vehiculo4 = new Deportivo("002512", "Bugatti", "Veyron ",
                "Azul  ", "2022", "Automatico 10 veclodiades ",
                "Exelente Nuevo ", 1000000.05, 0.0, "ALto gasto",
                "Ergonomico  ", "7000cc", "3 acientos ", "380 kilometros k/h ");
        Autos vehiculo5 = new SUV("152233", "Mazda ", "CX-30 ", "Negro   ",
                "2019", "Automatico ", "Regular  ", 100000.2,
                50000.2, "ALto gasto", "Profesional ", "4000 cc", ""
                + "4 acientos ", " 7 pasajeros ", "Tradicional");
        Autos vehiculo6 = new Microbus("556622", "Mercedes Benz", "8-150FEB ",
                "Morado   ", "2006", "Dual ", "Muy bueno   ",
                5000.2, 100000.2, "Regular ", "Van ", "6000 cc",
                "8 acientos ", " 12 pasajeros ", "Electrica ");
        Autos vehiculo7 = new Carga("668844", "Scania", "r500", "Blanco   ",
                "2012", "Manual 15 velocidades  ", "Exelente   ", 50000.232,
                1000000.05, "Versatil  ", "Doble piña  ", "135000 cc",
                "2 acientos ", " 20 toneladas ", "Carga de alto peso ");
        Autos vehiculo8 = new ATV("995544", "Yamaha", "ytz 450", "Gris   ", ""
                + "2001", "Automatico ", "Exelente   ", 5000.242,
                00.05, "4 ejes   ", "Montan ", "600 cc", "1 acientos ",
                " Si  ", "Tradicional  ");
        Autos vehiculo9 = new Sedan("886644", "Hyundai ", "grand i10", "Blanco   "
                + " ", "20016", "Automatico ", "Exelente   ", 3000.25,
                5000.0, "2 ejes    ", "Accendt  ", "1500 cc",
                "3 acientos ", " 14  ", "Electrico  ");

        vehiculo.add(vehiculo1);
        vehiculo.add(vehiculo2);
        vehiculo.add(vehiculo3);
        vehiculo.add(vehiculo4);
        vehiculo.add(vehiculo5);
        vehiculo.add(vehiculo6);
        vehiculo.add(vehiculo7);
        vehiculo.add(vehiculo8);
        vehiculo.add(vehiculo9);

        JOptionPane.showMessageDialog(null,
                "Bienvenidos a venta de autos, estos son nuestros vehiculos disponibles");

        for (Autos vehiculos : vehiculo) {
//            JOptionPane.showMessageDialog(null, "Siguiente auto disponible ");
            JOptionPane.showMessageDialog(null, vehiculos.mostrarDatos());
        }
    

                                            
    }//GEN-LAST:event_lbverinventarioActionPerformed

    private void jbfacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfacturacionActionPerformed
      Facturacion o = new Facturacion();
         o.setVisible (true);
    }//GEN-LAST:event_jbfacturacionActionPerformed

    private void jbclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclientesActionPerformed
        clientes b = new clientes();
        b.setVisible (true);
    }//GEN-LAST:event_jbclientesActionPerformed

    private void jbregistroempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistroempleadosActionPerformed
        List<Persona> empleado = new ArrayList();
 Persona empleado1 = new Empleado(475000.00, "Ventas",
                "Rafael ", "Herrero", "3-5689-5321",
                "5698-4532", "San Isidro, Heredia",
                "rherrero@vehiculoscr.com");
        Persona empleado2 = new Empleado(450000.00, "Ventas",
                "Adrian", "Ramos", "5-5645-9875",
                "6598-2156", "San Isidro, Heredia",
                "aramos@vehiculoscr.com");
        Persona empleado3 = new Empleado(700000.00, "Administracion",
                "Rosario", "Moreno", "7-3654-7541",
                "7856-3216", "Santa Ana, Escazú",
                "emoreno@vehiculoscr.com");

        empleado.add(empleado1);
        empleado.add(empleado2);
        empleado.add(empleado3);

        for (Persona empleados : empleado) {
//            JOptionPane.showMessageDialog(null, "Lista de Empleados ");
            JOptionPane.showMessageDialog(null, empleados.mostrarDatos());
        }
    }//GEN-LAST:event_jbregistroempleadosActionPerformed

    private void jbclientesmenbreciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclientesmenbreciasActionPerformed
       List<Persona> cliente = new ArrayList();
Persona cliente1 = new Cliente("Marco", "Polo", "1-1234-1234",
                "5555-5555", "Santa Rosa, Heredia", "marcopolo33@live.com");
        Persona cliente2 = new Cliente("Rebeca ", "Gómez ", "4-63145-2456",
                "7777-7777", "Turrialba, Cartago", "rebe27@radiodos.com");
        Persona cliente3 = new Cliente("Matías ", "Ortega ", "5-3968-6547",
                "5555-5555", "Santa Rosa, Heredia", "matías.ortega87@mitierra.cr");
        Persona cliente4 = new Cliente("Juan Pablo", "Muñoz ", "2-2365-7412",
                "5555-5555", "Santa Rosa, Heredia", "jpmunos112@outlook.com");

        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);

        for (Persona clientes : cliente) {
//            JOptionPane.showMessageDialog(null, "Lista de clientes ");
            JOptionPane.showMessageDialog(null, clientes.mostrarDatos());
        }
    }//GEN-LAST:event_jbclientesmenbreciasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbclientes;
    private javax.swing.JButton jbclientesmenbrecias;
    private javax.swing.JButton jbfacturacion;
    private javax.swing.JButton jbregistroempleados;
    private javax.swing.JButton jbsalir;
    private javax.swing.JButton lbverinventario;
    // End of variables declaration//GEN-END:variables
}
