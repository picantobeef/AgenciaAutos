package proyecto;

public class Cliente extends Persona {

    public Cliente(String Nombre, String Apellidos, String Cédula, String Telefono, String Direccion, String Email) {
        super(Nombre, Apellidos, Cédula, Telefono, Direccion, Email);
    }

//    Cliente() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String mostrarDatos() {
        return "***Registro de Clientes***\n" + super.mostrarDatos();
    }

}
