package uniquindio.edu.co;

public class Residente extends Clientes{
    private String direccion;

    public Residente(String nombre, String correo, int documento, String direccion) {
        super(nombre, correo, documento);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mensajeCliente() {
        System.out.println("===Residente===");
        super.mensajeCliente();
        System.out.println("Direccion: "+getDireccion());
    }
}
