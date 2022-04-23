/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuraciones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionBD {

    Connection con = null;
    //db_usuario: es el motor de base de datos
    //cliente es el nombre de la tabla
    private final String url = "jdbc:mysql://localhost/db_usuarios";

    public ConexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            if (con != null) {
                JOptionPane.showMessageDialog(null,
                        "Conexión a base de datos realizada.",
                        "Conectado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo establecer conexión con la base de datos" + url,
                    "Conectado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Connection conectado() {
        return con;
    }

    public void desconectar() {
        con = null;
    }
}
