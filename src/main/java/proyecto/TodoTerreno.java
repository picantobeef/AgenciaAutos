package proyecto;

public class TodoTerreno extends Autos {

    private String caballosFuerza;

    public TodoTerreno(String matricula, String marca,
            String modelo, String colorexterior, String año,
            String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada,
            String capacidad, String caballosdefuerza) {

        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, economia, tipo, cilindrada, capacidad);
        this.caballosFuerza = caballosdefuerza;

    }

    public String getCaballosdefuerza() {
        return caballosFuerza;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCaballos de fuerza: " + caballosFuerza;
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
