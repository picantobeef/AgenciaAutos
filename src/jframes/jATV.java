/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import vehiculos.ATV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import personas.Registro;

/**
 *
 * @author scont
 */
public class jATV extends javax.swing.JFrame {

    private TableRowSorter trsfiltro;
    static DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Matrícula", "Marca", "Modelo", "Color Exterior", "Año",
        "Transmisión", "Condición", "Rango Precio", "Kilómetros", "Tipo",
        "Cilindrada", "Capacidad", "Reversa", "Motor"};
    static ArrayList<ATV> arreglo;
    
//    static ArrayList<jATV> jArreglo;
    static ArrayList<Registro> arregloATV;
    
    public jATV() {
        arreglo = new ArrayList<>();
        arregloATV = new ArrayList<>();
        initComponents();

        md = new DefaultTableModel(data, cabeza);
        jTablaATV.setModel(md);

        setLocationRelativeTo(null);
    }

    public static void Listar() {
        DefaultListModel Md = new DefaultListModel();
        DefaultTableModel tabla = new DefaultTableModel();

        for (int i = 0; i < arreglo.size(); i++) {
            //Lee la información de los campos
            String matricula = arreglo.get(i).getMatricula();
            String marca = arreglo.get(i).getMarca();
            String modelo = arreglo.get(i).getModelo();
            String colorExterior = arreglo.get(i).getColorExterior();
            String anno = arreglo.get(i).getAnno();
            String transmision = arreglo.get(i).getTransmision();
            String condicion = arreglo.get(i).getCondicion();
            double rangoPrecios = arreglo.get(i).getRangoPrecios();
            double kilometros = arreglo.get(i).getKilometros();
            String tipo = arreglo.get(i).getTipo();
            String cilindrada = arreglo.get(i).getCilindrada();
            String capacidad = arreglo.get(i).getCapacidad();
            String reversa = arreglo.get(i).getReversa();
            String motor = arreglo.get(i).getMotor();

            String rangPrecios = String.valueOf(rangoPrecios);
            String km = String.valueOf(kilometros);

            //Almacena la información en un vector
            String datos[] = {matricula, marca, modelo, colorExterior,
                anno, transmision, condicion, rangPrecios,
                km, tipo, cilindrada, capacidad, reversa, motor};
            md.addRow(datos);
        }
    }

    public void Limpiar() {
        this.jtfMatricula.setText("");
        this.jtfMarca.setText("");
        this.jtfModelo.setText("");
        this.jtfColorExterior.setText("");
        this.jtfAnno.setText("");
        this.jtfRangoPrecios.setText("");
        this.jtfKilometros.setText("");
        this.jtfCilindrada.setText("");
        this.jtfCapacidad.setText("");

    }

    public void BorrarTabla() {
        for (int i = 0; i < jTablaATV.getRowCount(); i++) {
            md.removeRow(i);
            i -= 1;
        }
    }

    public static void CargarDatos() {
        try {
            FileInputStream Archivo = new FileInputStream("BasedeDatosATV.dat");
            ObjectInputStream Obj = new ObjectInputStream(Archivo);            
//            jArreglo = (ArrayList<jATV>) Obj.readObject();
            arreglo = (ArrayList<ATV>) Obj.readObject();

        } catch (Exception e) {

        }
        Listar();
    }

    public void agregar() {
        boolean siEsta = true;
        if (this.jtfMatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfColorExterior.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfAnno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfRangoPrecios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfKilometros.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfCilindrada.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else if (this.jtfCapacidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos!!");
        } else {
            jATV nuevoATV = new jATV();

            boolean esta = false;
            for (int e = 0; e < arreglo.size(); e++) {
                //Este if valida si existe una cedula en el ArrayList contra lo que se digito 
                //en el campo cedula, para evitar duplicados
                if (arreglo.get(0).getMatricula().equals(this.jtfMatricula.getText())) {
                    esta = true;
                }
            }

            //Si la variable booleana esta es true quiere decir que la cedula esta duplicada
            if (esta) {
                JOptionPane.showMessageDialog(null,
                        "Ya existe esa matrícula en el registro", "", -1);
            } else {
                //Se lee la información de los campos y se almacena en un ArrayList

                String matricula = jtfMatricula.getText();
                String marca = jtfMarca.getText();
                String modelo = jtfModelo.getText();
                String colorExterior = jtfColorExterior.getText();
                String anno = jtfAnno.getText();
                String transmision = jcbTransmision.getSelectedItem().toString();
                String condicion = jcbCondicion.getSelectedItem().toString();
                double rangoPrecios = Double.parseDouble(jtfRangoPrecios.getText());
                double kilometros = Double.parseDouble(jtfKilometros.getText());
                String tipo = this.jcbTipo.getSelectedItem().toString();
                String cilindrada = jtfCilindrada.getText();
                String capacidad = jtfCapacidad.getText();
                boolean Reversa = jcbReversa.isSelected();
                
                if (Reversa) {
                    jcbReversa.setSelected(true);
                } else {
                    jcbReversa.setSelected(false);
                }
                
                String tieneReversa = String.valueOf(Reversa);
                String motor2 = this.jbgMotor.getSelection().toString();

                if (Reversa) {
                    jcbReversa.setSelected(true);
                } else {
                    jcbReversa.setSelected(false);
                }

                arreglo.add(new ATV(matricula, marca, modelo, colorExterior,
                        anno, transmision, condicion, rangoPrecios,
                        kilometros, tipo, cilindrada, capacidad,
                        tieneReversa, motor2));

                JOptionPane.showMessageDialog(null, "La información fue agregada correctamente.", "", -1);
                BorrarTabla();
                Listar();
                Limpiar();
            }
        }

        GuardarDatos();

    }

    public void GuardarDatos() {
        try {
            FileOutputStream Archivo = new FileOutputStream("BasedeDatosATV.dat");
            ObjectOutputStream Obj = new ObjectOutputStream(Archivo);
            Obj.writeObject(arreglo);

            JOptionPane.showMessageDialog(null, "¡¡El archivo se guardo correctamente!!", "", -1);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "¡¡Upss!!,tenemos problemas con el archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "¡¡Upss!!,tenemos problemas con el archivo");
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

        jbgMotor = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlRegistroVehiculos = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jlMarca = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jlMatricula = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jlModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlColorExterior = new javax.swing.JLabel();
        jtfColorExterior = new javax.swing.JTextField();
        jlanno = new javax.swing.JLabel();
        jtfAnno = new javax.swing.JTextField();
        jlTransmicion = new javax.swing.JLabel();
        jlCondicion = new javax.swing.JLabel();
        jlRangoPrecio = new javax.swing.JLabel();
        jtfRangoPrecios = new javax.swing.JTextField();
        jlKilometros = new javax.swing.JLabel();
        jtfKilometros = new javax.swing.JTextField();
        jlTipo = new javax.swing.JLabel();
        jlCilindrada = new javax.swing.JLabel();
        jtfCilindrada = new javax.swing.JTextField();
        jlCapacidad = new javax.swing.JLabel();
        jtfCapacidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaATV = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbCondicion = new javax.swing.JComboBox<>();
        jcbTransmision = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jrbElectrico = new javax.swing.JRadioButton();
        jrdTradicional = new javax.swing.JRadioButton();
        jlMotor = new javax.swing.JLabel();
        jlReversa = new javax.swing.JLabel();
        jcbReversa = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jlRegistroVehiculos.setFont(new java.awt.Font("Hannotate TC", 3, 48)); // NOI18N
        jlRegistroVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        jlRegistroVehiculos.setText("REGISTRO DE ATV");

        jbVolver.setBackground(new java.awt.Color(0, 102, 102));
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlRegistroVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlRegistroVehiculos)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jlMarca.setText("Marca:");

        jlMatricula.setText("Matricula:");

        jlModelo.setText("Modelo:");

        jlColorExterior.setText("Color Exterior:");

        jlanno.setText("Año:");

        jlTransmicion.setText("Transmición:");

        jlCondicion.setText("Condición:");

        jlRangoPrecio.setText("Rango Precio:");

        jtfRangoPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRangoPreciosActionPerformed(evt);
            }
        });

        jlKilometros.setText("Kilometros:");

        jlTipo.setText("Tipo:");

        jlCilindrada.setText("Cilindrada:");

        jlCapacidad.setText("Capacidad:");

        jtfCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCapacidadActionPerformed(evt);
            }
        });

        jTablaATV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Marca", "Modelo", "Color Exterior", "Año", "Transmisión", "Condición", "Rango Precio", "Kilómetros", "Tipo", "Cilindrada", "Capacidad", "Motor", "Reversa"
            }
        ));
        jScrollPane1.setViewportView(jTablaATV);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Nuevo", "Usado" }));

        jcbTransmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Manual", "Automático" }));

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Para niños", "Utilidad", "Entry-Level", "Sport" }));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jbgMotor.add(jrbElectrico);
        jrbElectrico.setText("Eléctrico");

        jbgMotor.add(jrdTradicional);
        jrdTradicional.setText("Tradicional");

        jlMotor.setText("Motor:");

        jlReversa.setText("Reversa:");

        jcbReversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReversaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlModelo)
                        .addGap(36, 36, 36)
                        .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jlRangoPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfRangoPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlColorExterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfColorExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlKilometros)
                                    .addComponent(jlTipo)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlMarca)
                                            .addGap(41, 41, 41)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jlMatricula))
                                    .addGap(82, 82, 82)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlTransmicion)
                                        .addComponent(jlCondicion))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbTransmision, 0, 144, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlanno)
                                    .addGap(51, 51, 51)
                                    .addComponent(jtfAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCilindrada)
                                .addGap(21, 21, 21)
                                .addComponent(jtfCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlMotor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCapacidad)
                                    .addComponent(jlReversa))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbReversa)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbElectrico)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrdTradicional))
                                    .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addGap(27, 27, 27)
                        .addComponent(jbModificar)
                        .addGap(30, 30, 30)
                        .addComponent(jbEliminar)))
                .addContainerGap(552, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMatricula)
                            .addComponent(jlTransmicion)
                            .addComponent(jcbTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMarca)
                            .addComponent(jlCondicion)
                            .addComponent(jcbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlModelo)
                            .addComponent(jlRangoPrecio)
                            .addComponent(jtfRangoPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCilindrada)
                            .addComponent(jtfCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCapacidad)
                            .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbElectrico)
                            .addComponent(jrdTradicional)
                            .addComponent(jlMotor))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlColorExterior)
                            .addComponent(jtfColorExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlKilometros)
                            .addComponent(jtfKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlReversa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlanno)
                            .addComponent(jlTipo)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar)
                            .addComponent(jbModificar)
                            .addComponent(jbEliminar)))
                    .addComponent(jcbReversa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCapacidadActionPerformed

    private void jtfRangoPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRangoPreciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRangoPreciosActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
//        modificar();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
//        eliminar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcbReversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReversaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReversaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        MenuVehiculos menuV = new MenuVehiculos();
        menuV.show();
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

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
            java.util.logging.Logger.getLogger(jATV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jATV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jATV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jATV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jATV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaATV;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.ButtonGroup jbgMotor;
    private javax.swing.JComboBox<String> jcbCondicion;
    private javax.swing.JCheckBox jcbReversa;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JComboBox<String> jcbTransmision;
    private javax.swing.JLabel jlCapacidad;
    private javax.swing.JLabel jlCilindrada;
    private javax.swing.JLabel jlColorExterior;
    private javax.swing.JLabel jlCondicion;
    private javax.swing.JLabel jlKilometros;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlMotor;
    private javax.swing.JLabel jlRangoPrecio;
    private javax.swing.JLabel jlRegistroVehiculos;
    private javax.swing.JLabel jlReversa;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlTransmicion;
    private javax.swing.JLabel jlanno;
    private javax.swing.JRadioButton jrbElectrico;
    private javax.swing.JRadioButton jrdTradicional;
    private javax.swing.JTextField jtfAnno;
    private javax.swing.JTextField jtfCapacidad;
    private javax.swing.JTextField jtfCilindrada;
    private javax.swing.JTextField jtfColorExterior;
    private javax.swing.JTextField jtfKilometros;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfRangoPrecios;
    // End of variables declaration//GEN-END:variables
}
