package proyecto;

public class SUV extends Autos {

    private String npasajeros;
    private String electricootradicional;

    public SUV(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada, String capacidad,
            String npasajeros, String electricootradicional) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion, rangodeprecios,
                kilometros, economia, tipo, cilindrada, capacidad);
        this.npasajeros = npasajeros;
        this.electricootradicional = electricootradicional;

    }

    public String getNpasajeros() {
        return npasajeros;
    }

    public String getElectricootradicional() {
        return electricootradicional;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nPasajeros: " + npasajeros
                + "\nElectrico o conbustion: " + electricootradicional;
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
