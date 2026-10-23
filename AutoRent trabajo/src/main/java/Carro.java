public class Carro extends Vehiculo{

    private int numeroPuertas;

    public Carro(String placa, String marca, String modelo, int añoFabricacion, Estado estado, int numeroPuertas) {
        super(placa, marca, modelo, añoFabricacion, estado);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Número de puertas= "+numeroPuertas;
    }

    public double calcularRecargo() {
        return 20000;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo;
        costo=(getTarifaBase().getTarifaInicial()+calcularRecargo())*dias;
        return costo;
    }
}
