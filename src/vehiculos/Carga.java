package vehiculos;

import vehiculos.Autos;

public class Carga extends Autos {

    private String maxCarga;
    private String especialidadcarga;

    public Carga(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion, double rangodeprecios,
            double kilometros, String tipo, String cilindrada,
            String capacidad, String maxcarga, String especialidadcarga) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros, tipo, cilindrada, capacidad);
        this.maxCarga = maxcarga;
        this.especialidadcarga = especialidadcarga;

    }

    public String getMaxcarga() {
        return maxCarga;
    }

    public String getEspecialidadcarga() {
        return especialidadcarga;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCarga maxima:" + maxCarga
                + "\nEspecialidad de carga: " + especialidadcarga;
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
