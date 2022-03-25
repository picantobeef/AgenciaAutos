package proyecto;

public class ATV extends Autos {

    private String reversaDisponible;
    private String electricoOTradicional;

    public ATV(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada,
            String capacidad, String reversadisponible, String electricootradicional) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, economia, tipo, cilindrada, capacidad);
        this.reversaDisponible = reversadisponible;
        this.electricoOTradicional = electricootradicional;

    }

    public String getReversadisponible() {
        return reversaDisponible;
    }

    public String getElectricootradicional() {
        return electricoOTradicional;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nReversa dispobile: " + reversaDisponible
                + "\nElectrico o conbustion: " + electricoOTradicional;
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
