package proyecto;

public class Cliente extends Persona {

    public Cliente(String Nombre, String Apellidos, String Cédula, String Teléfono, String Dirección, String Email) {
        super(Nombre, Apellidos, Cédula, Teléfono, Dirección, Email);
    }

    public String mostrarDatos() {
        return "***Registro de Clientes***\n" + super.mostrarDatos();
    }

}
