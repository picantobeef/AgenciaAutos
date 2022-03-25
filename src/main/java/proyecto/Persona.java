package proyecto;

abstract class Persona {

    private String Nombre;
    private String Apellidos;
    private String Cedula;
    private String Teléfono;
    private String Dirección;
    private String Email;

    public Persona(String Nombre, String Apellidos, String Cedula, String Teléfono,
            String Dirección, String Email) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Teléfono = Teléfono;
        this.Dirección = Dirección;
        this.Email = Email;
    }

    public String mostrarDatos() {
        return "\nNombre: " + Nombre + "\nApellidos: "
                + Apellidos + "\nCédula: " + Cedula + "\nTeléfono: "
                + Teléfono + "\nDirección: " + Dirección + "\nEmail: " + Email;
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

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

}
