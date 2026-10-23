public class Carro extends Vehiculo{

    private int numeroPuertas;

    public Carro(int añoFabricacion, String marca, String modelo, String placa, Estado estado, TarifaBase tarifaBase, int numeroPuertas) {
        super(añoFabricacion, marca, modelo, placa, estado, tarifaBase);
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
                "Número de puertas= "+numeroPuertas;
    }

    @Override
    public int calcularAlquiler(int dias) {
        double alquiler;
        alquiler=(Vehiculo.getTarifaBase()+20000)*dias;

        return alquiler;
    }
}
