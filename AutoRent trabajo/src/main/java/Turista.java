public class Turista extends Cliente {
    private String visa;

    public Turista(String nombre, String documento, String correo, String visa) {
        super(nombre, documento, correo);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    @Override
    public String toString() {
        return "Turista " + super.toString() +
                "Numero de visa= " + visa;
    }
}
