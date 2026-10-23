import java.time.LocalDate;

public class Alquiler {

    private int codigo;
    private LocalDate fechaAlquiler;
    private int numeroDias;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(int codigo, LocalDate fechaAlquiler, int numeroDias, Cliente cliente, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.fechaAlquiler = fechaAlquiler;
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "codigo=" + codigo +
                ", fechaAlquiler=" + fechaAlquiler +
                ", numeroDias=" + numeroDias +
                ", cliente=" + cliente.getNombreCompleto() +
                ", vehiculo=" + vehiculo.getPlaca() +
                '}';
    }
}
