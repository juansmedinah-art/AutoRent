package uniquindio.edu.co;

public abstract class Clientes {
    private String nombre;
    private String correo;
    private String Documento;

    public Clientes(String nombre, String correo, String documento) {
        this.nombre = nombre;
        this.correo = correo;
        Documento = documento;
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

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public void mensajeCliente(){
        System.out.println("==Cliente==");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Documento: "+getDocumento());
    }
}
