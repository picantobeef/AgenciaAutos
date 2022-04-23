package vehiculos;

import vehiculos.Autos;

public class SUV extends Autos {

    private String numPasajeros;
    private String electricoOTradicional;

    public SUV(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion, double rangodeprecios,
            double kilometros, String tipo, String cilindrada, String capacidad,
            String numPasajeros, String electricootradicional) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion, rangodeprecios,
                kilometros,tipo, cilindrada, capacidad);
        this.numPasajeros = numPasajeros;
        this.electricoOTradicional = electricoOTradicional;

    }

    public String getNumPasajeros() {
        return numPasajeros;
    }

    public String getElectricoOTradicional() {
        return electricoOTradicional;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCantidad de Pasajeros: " + numPasajeros
                + "\nElectrico o combustión: " + electricoOTradicional;
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
