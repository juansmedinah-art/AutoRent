public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private Estado estado;
    private TarifaBase tarifaBase;

    public Vehiculo(String placa, String marca, String modelo, int añoFabricacion, Estado estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.estado = estado;
        this.tarifaBase = TarifaBase.TARIFA_BASE;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TarifaBase getTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", estado=" + estado +
                ", tarifaBase=" + tarifaBase.getTarifaInicial() +
                '}';
    }

    public abstract double calcularCostoAlquiler(int dias);
}
