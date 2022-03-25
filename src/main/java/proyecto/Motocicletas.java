package proyecto;

public class Motocicletas extends Autos {

    private String cantidadPistones;

    public Motocicletas(String matricula, String marca, String modelo,
            String colorexterior, String año, String transmicion,
            String condicion, double rangodeprecios, double kilometros,
            String economia, String tipo, String cilindrada, String capacidad,
            String cantidaddepistones) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, economia, tipo, cilindrada, capacidad);
        this.cantidadPistones = cantidaddepistones;

    }

    public String getCantidadepistones() {
        return cantidadPistones;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nPistones: " + cantidadPistones;
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
