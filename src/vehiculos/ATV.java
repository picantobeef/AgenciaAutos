package vehiculos;

import java.io.Serializable;
import vehiculos.Autos;

public class ATV extends Autos implements Serializable{

    private String reversa;
    private String motor;

    public ATV(String matricula, String marca, String modelo, String colorExterior,
            String año, String transmicion, String condicion, double rangoPrecios,
            double kilometros, String tipo, String cilindrada,
            String capacidad, String reversa, String motor) {
        super(matricula, marca, modelo, colorExterior, año, transmicion, condicion,
                rangoPrecios, kilometros, tipo, cilindrada, capacidad);
        this.reversa = reversa;
        this.motor = motor;

    }


    public String getReversa() {
        return reversa;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nReversa dispobile: " + reversa
                + "\nElectrico o conbustion: " + motor;
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
