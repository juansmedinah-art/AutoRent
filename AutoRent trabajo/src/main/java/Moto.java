public class Moto extends Vehiculo{

    private String cilindraje;

    public Moto(String placa, String marca, String modelo, int añoFabricacion, Estado estado, String cilindraje) {
        super(placa, marca, modelo, añoFabricacion, estado);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Cilindraje= "+cilindraje;
    }

    public double calcularDescuento() {
        return getTarifaBase().getTarifaInicial()*0.10;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo;
        costo=(getTarifaBase().getTarifaInicial()-calcularDescuento())*dias;
        return costo;
    }
}
