public class Moto extends Vehiculo{

    private String clindraje;

    public Moto(int añoFabricacion, String marca, String modelo, String placa, Estado estado, TarifaBase tarifaBase, String clindraje) {
        super(añoFabricacion, marca, modelo, placa, estado, tarifaBase);
        this.clindraje = clindraje;
    }

    @Override
    public int calcularAlquiler(int dias) {

        double alquiler;
        alquiler=tarifaBase*0.90*dias;
        return alquiler;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cilindraje= "+ clindraje;

    }

    public String getClindraje() {
        return clindraje;
    }

    public void setClindraje(String clindraje) {
        this.clindraje = clindraje;
    }
}
