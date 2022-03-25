package proyecto;

public class Deportivo extends Autos {

    private String maxVelocidad;

    public Deportivo(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada,
            String capacidad, String maxvelocidad) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, economia, tipo, cilindrada, capacidad);
        this.maxVelocidad = maxvelocidad;

    }

    public String getMaxvelocidad() {
        return maxVelocidad;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nVelocidad Maxima: " + maxVelocidad;
    }

    @Override
    public void Agregar() {
    }

    @Override
    public void Modificar() {
    }

    @Override
    public void Eliminar() {
    }

    @Override
    public void Guardar() {
    }

}
