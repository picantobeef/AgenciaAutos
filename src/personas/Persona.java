package personas;

public class Persona {

    private String nombreCompleto;
    private String cedula;
    private String telefono;
    private String direccion;
    private String email;

    public Persona(String nombreCompleto, String cedula, String telefono,
            String direccion, String email) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public String mostrarDatos() {
        return "\nNombre: " + nombreCompleto + "\nCédula: " + cedula + "\nTeléfono: "
                + telefono + "\nDirección: " + direccion + "\nEmail: " + email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTeléfono() {
        return telefono;
    }

    public void setTeléfono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String direccion) {
        this.direccion = direccion;
    }

}
