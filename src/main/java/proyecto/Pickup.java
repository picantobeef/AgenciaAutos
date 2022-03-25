package proyecto;

public class Pickup extends Autos {

    private String cantidadCabinas;

    public Pickup(String matricula, String marca,
            String modelo, String colorexterior, String año,
            String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada,
            String capacidad, String cantidaddecabinas) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, economia, tipo, cilindrada, capacidad);
        this.cantidadCabinas = cantidaddecabinas;

    }

    public String getCantidaddecabinas() {
        return cantidadCabinas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCabinas: " + cantidadCabinas;

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
