package uniquindio.edu.co;

public abstract class Clientes {
    private String nombre;
    private String correo;
    private int Documento;

    public Clientes(String nombre, String correo, int documento) {
        this.nombre = nombre;
        this.correo = correo;
        this.Documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public void mensajeCliente(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Documento: "+getDocumento());
    }
}
