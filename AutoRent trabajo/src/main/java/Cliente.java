public abstract class Cliente {
    private String nombre;
    private String documento;
    private String correo;

    public Cliente(String nombre, String documento, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombre;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
