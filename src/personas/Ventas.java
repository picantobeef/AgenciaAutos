package personas;

public class Ventas {

    private String nombreAgencia;
    private String emailAgencia;
    private String telefonoAgencia;
    private String numFactura;
    private String tipoFactura;
    private Double subtotal;
    private Double descuentos;
    protected final float IVA = 0.13f;
    private Double total;

    public Ventas(String nombreAgencia, String emailAgencia,
            String telefonoAgencia, String numFactura, String tipoFactura,
            Double subtotal, Double descuentos, Double total) {
        this.nombreAgencia = nombreAgencia;
        this.emailAgencia = emailAgencia;
        this.telefonoAgencia = telefonoAgencia;
        this.numFactura = numFactura;
        this.tipoFactura = tipoFactura;
        this.subtotal = subtotal;
        this.descuentos = descuentos;
        this.total = total;
    }

    public void Facturación() {
    }

    public String mostrarDatos() {
        return "***Registro de Ventas***"
                + "\n\nNombre de la Agencia: " + nombreAgencia
                + "\nEmail: " + emailAgencia
                + "\nTelefono: " + telefonoAgencia
                + "\n\nNumero de Factura: " + numFactura
                + "\nTipo de Factura: " + tipoFactura
                + "\n\nSubtotal: " + subtotal
                + "\nDescuentos: " + descuentos
                + "\nIVA: " + IVA
                + "\n\nTotal: " + total;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Double descuentos) {
        this.descuentos = descuentos;
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
        return total;
    }

    public void setTotal(Double Total) {
        this.total = Total;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.subtotal = Subtotal;
    }

}
