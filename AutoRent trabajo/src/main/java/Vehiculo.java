import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int añoFabricacion;

    private Estado estado;
    private TarifaBase tarifaBase;

    private List<Alquiler> listaAlquileres;

    public Vehiculo(int añoFabricacion, String marca, String modelo, String placa, Estado estado, TarifaBase tarifaBase) {


        this.añoFabricacion = añoFabricacion;
        this.listaAlquileres = new ArrayList<>();
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;

        this.estado=estado;
        this.tarifaBase=tarifaBase;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public void setTarifaBase(TarifaBase tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "añoFabricacion=" + añoFabricacion +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estado=" + estado +
                ", tarifaBase=" + tarifaBase +
                ", listaAlquileres=" + listaAlquileres +
                '}';
    }

    public abstract int calcularAlquiler(int dias.getNumeroDias()){
    }
}
