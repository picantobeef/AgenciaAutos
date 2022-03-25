package proyecto;

public class Sedan extends Autos {

    private String numeroaro;
    private String electricootradicional;

    public Sedan(String matricula, String marca, String modelo, String colorexterior, String año,
            String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada,
            String capacidad, String numeroaro,
            String electricootradicional) {
        super(matricula, marca, modelo, colorexterior, año, transmicion, condicion,
                rangodeprecios, kilometros,
                economia, tipo, cilindrada, capacidad);
        this.numeroaro = numeroaro;
        this.electricootradicional = electricootradicional;
    }

    public String getNumeroaro() {
        return numeroaro;
    }

    public String getElectricootradicional() {
        return electricootradicional;
    }

    public String mostrardatos() {
        return super.mostrarDatos() + "\nNumero de aro: " + numeroaro
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
