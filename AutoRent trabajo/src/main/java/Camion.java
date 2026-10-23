public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(int añoFabricacion, String marca, String modelo, String placa, Estado estado, TarifaBase tarifaBase, double capacidadCarga) {
        super(añoFabricacion, marca, modelo, placa, estado, tarifaBase);
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
                "Capacidad de carga= "+capacidadCarga;
    }

    @Override
    public int calcularAlquiler(int dias) {
        double alquiler=0.0;
        alquiler=(TarifaBase.getTarifaBase()+50000)*dias;
        return alquiler;
    }
}
