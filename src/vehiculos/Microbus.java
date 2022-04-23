package vehiculos;

import vehiculos.Autos;

public class Microbus extends Autos {

    private String numPasajeros;
    private String electricoOTradicional;

    public Microbus(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion,
            double rangodeprecios, double kilometros, String tipo,
            String cilindrada, String capacidad, String npasajeros, String electricootradicional) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, tipo, cilindrada, capacidad);
        this.numPasajeros = npasajeros;
        this.electricoOTradicional = electricootradicional;

    }

    public String getNpasajeros() {
        return numPasajeros;
    }

    public String getElectricootradicional() {
        return electricoOTradicional;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nPasajeros:  " + "  " + numPasajeros
                + "\nElectrico o conbustion:    " + electricoOTradicional;
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
