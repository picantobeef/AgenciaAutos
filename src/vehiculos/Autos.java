package vehiculos;

import java.io.Serializable;


abstract class Autos implements Serializable{

    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String colorExterior;
    protected String anno;
    protected String transmision;
    protected String condicion;
    protected double rangoPrecios;
    protected double kilometros;
    protected String tipo;
    protected String cilindrada;
    protected String capacidad;

    public Autos(String matricula, String marca, String modelo, String colorexterior,
            String anno, String transmision, String condicion, double rangoPrecios,
            double kilometros, String tipo, String cilindrada, String capacidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.colorExterior = colorExterior;
        this.anno = anno;
        this.transmision = transmision;
        this.condicion = condicion;
        this.rangoPrecios = rangoPrecios;
        this.kilometros = kilometros;
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

    public String getColorExterior() {
        return colorExterior;
    }

    public String getAnno() {
        return anno;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getCondicion() {
        return condicion;
    }

    public double getRangoPrecios() {
        return rangoPrecios;
    }

    public double getKilometros() {
        return kilometros;
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
                + "\nAño:    " + anno + "\nTransmicion:     " + transmision + "\nCondicion:   "
                + condicion + "\nRangodeprecios:    " + rangoPrecios
                + "\nKilometraje:      " + kilometros 
                + "\nTipo:     " + tipo
                + "\nCilindrada;     " + cilindrada + "\nCapacidad:      " + capacidad;

    }

}
