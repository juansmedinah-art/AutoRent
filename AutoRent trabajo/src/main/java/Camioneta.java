public class Camioneta extends Vehiculo{

    private double capacidadCarga;

    public Camioneta(String placa, String marca, String modelo, int añoFabricacion, Estado estado, double capacidadCarga) {
        super(placa, marca, modelo, añoFabricacion, estado);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Capacidad de carga= "+capacidadCarga;
    }

    public double calcularRecargo() {
        return 50000;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo;
        costo=(getTarifaBase().getTarifaInicial()+calcularRecargo())*dias;
        return costo;
    }
}
