package proyecto;

public class Ventas {

    private String nombreAgencia;
    private String emailAgencia;
    private String telefonoAgencia;
    private String numFactura;
    private String TipoFactura;
    private Double Subtotal;
    private Double Descuentos;
    protected final float IVA = 0.13f;
    private Double Total;

    public Ventas(String nombreAgencia, String emailAgencia,
            String telefonoAgencia, String numFactura, String TipoFactura,
            Double Subtotal, Double Descuentos, Double Total) {
        this.nombreAgencia = nombreAgencia;
        this.emailAgencia = emailAgencia;
        this.telefonoAgencia = telefonoAgencia;
        this.numFactura = numFactura;
        this.TipoFactura = TipoFactura;
        this.Subtotal = Subtotal;
        this.Descuentos = Descuentos;
        this.Total = Total;
    }

    public void Facturación() {
    }

    public String mostrarDatos() {
        return "***Registro de Ventas***"
                + "\n\nNombre de la Agencia: " + nombreAgencia
                + "\nEmail: " + emailAgencia
                + "\nTelefono: " + telefonoAgencia
                + "\n\nNumero de Factura: " + numFactura
                + "\nTipo de Factura: " + TipoFactura
                + "\n\nSubtotal: " + Subtotal
                + "\nDescuentos: " + Descuentos
                + "\nIVA: " + IVA
                + "\n\nTotal: " + Total;
    }

    public String getTipoFactura() {
        return TipoFactura;
    }

    public void setTipoFactura(String TipoFactura) {
        this.TipoFactura = TipoFactura;
    }

    public Double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(Double Descuentos) {
        this.Descuentos = Descuentos;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getEmailAgencia() {
        return emailAgencia;
    }

    public void setEmailAgencia(String emailAgencia) {
        this.emailAgencia = emailAgencia;
    }

    public String getTelefonoAgencia() {
        return telefonoAgencia;
    }

    public void setTelefonoAgencia(String telefonoAgencia) {
        this.telefonoAgencia = telefonoAgencia;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }

}
