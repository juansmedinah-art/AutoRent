package uniquindio.edu.co;

public class Turista extends Clientes {
    private String visa;

    public Turista(String nombre, String correo, int documento, String visa) {
        super(nombre, correo, documento);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    @Override
    public void mensajeCliente() {
        System.out.println("===Turista===");
        super.mensajeCliente();
        System.out.println("Visa: "+getVisa());
    }
}
