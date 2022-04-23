package personas;

import personas.Persona;

public class Empleado extends Persona {

    private Double Salario;
    private String Departamento;

    public Empleado(Double Salario, String Departamento, String nombreCompleto,
            String cedula, String telefono,
            String direccion, String email) {
        super(nombreCompleto, cedula, telefono, direccion, email);
        this.Salario = Salario;
        this.Departamento = Departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "***Registro de Empleados***" + super.mostrarDatos() 
                + "Salario: " + Salario + "\nDepartamento: " + Departamento;
    }

}
