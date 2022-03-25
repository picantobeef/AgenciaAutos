package proyecto;

abstract class Autos {

    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String colorExterior;
    protected String año;
    protected String transmicion;
    protected String condicion;
    protected double rangoPrecios;
    protected double kilometros;
    protected String economia;
    protected String tipo;
    protected String cilindrada;
    protected String capacidad;

    public Autos(String matricula, String marca, String modelo, String colorexterior,
            String año, String transmicion, String condicion, double rangodeprecios,
            double kilometros, String economia, String tipo, String cilindrada, String capacidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.colorExterior = colorexterior;
        this.año = año;
        this.transmicion = transmicion;
        this.condicion = condicion;
        this.rangoPrecios = rangodeprecios;
        this.kilometros = kilometros;
        this.economia = economia;
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.capacidad = capacidad;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColorexterior() {
        return colorExterior;
    }

    public String getAño() {
        return año;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public String getCondicion() {
        return condicion;
    }

    public double getRangodeprecios() {
        return rangoPrecios;
    }

    public double getKilometros() {
        return kilometros;
    }

    public String getEconomia() {
        return economia;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public String getCapacidad() {
        return capacidad;
    }

    abstract void Agregar();

    abstract void Modificar();

    abstract void Eliminar();

    abstract void Guardar();

    public String mostrarDatos() {

        return "Matricula ;     " + matricula + "\nMarca;   " + marca + "\nModelo:    "
                + modelo + "\nColor exterior:     " + colorExterior
                + "\nAño:    " + año + "\nTransmicion:     " + transmicion + "\nCondicion:   "
                + condicion + "\nRangodeprecios:    " + rangoPrecios
                + "\nKilometraje:      " + kilometros + "\nEconomia:       " + economia
                + "\nTipo:     " + tipo
                + "\nCilindrada;     " + cilindrada + "\nCapacidad:      " + capacidad;

    }

}
