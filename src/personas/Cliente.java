package personas;

public class Cliente extends Persona {

    public Cliente(String nombreCompleto, String cedula, String telefono,
            String direccion, String email) {
        super(nombreCompleto, cedula, telefono, direccion, email);
    }

    public String mostrarDatos() {
        return "***Registro de Clientes***\n" + super.mostrarDatos();
    }

}
