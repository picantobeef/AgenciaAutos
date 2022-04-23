package vehiculos;

import vehiculos.Autos;

public class Sedan extends Autos {

    private String numeroAro;
    private String electricoOTradicional;

    public Sedan(String matricula, String marca, String modelo, String colorexterior, String año,
            String transmicion, String condicion, double rangodeprecios,
            double kilometros, String tipo, String cilindrada,
            String capacidad, String numeroaro,
            String electricootradicional) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros,
                tipo, cilindrada, capacidad);
        this.numeroAro = numeroaro;
        this.electricoOTradicional = electricoOTradicional;
    }

    public String getNumeroAro() {
        return numeroAro;
    }

    public String getElectricoOTradicional() {
        return electricoOTradicional;
    }

    public String mostrardatos() {
        return super.mostrarDatos() + "\nNumero de aro: " + numeroAro
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
