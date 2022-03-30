package proyecto;

abstract class Persona {

    private String Nombre;
    private String Apellidos;
    private String Cedula;
    private String Telefono;
    private String Direccion;
    private String Email;

    public Persona(String Nombre, String Apellidos, String Cedula, String Telefono,
            String Direccion, String Email) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Email = Email;
    }

    public String mostrarDatos() {
        return "\nNombre: " + Nombre + "\nApellidos: "
                + Apellidos + "\nCédula: " + Cedula + "\nTeléfono: "
                + Telefono + "\nDirección: " + Direccion + "\nEmail: " + Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = this.Direccion;
    }

}
