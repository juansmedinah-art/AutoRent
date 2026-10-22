package uniquindio.edu.co;

public class pruebas {
    static void main() {
        Residente residente1=new Residente("juan","abc",123,"manzanita");
        residente1.mensajeCliente();
        System.out.println();

        Turista turista1=new Turista("pepe","def",321,"nosecomoponerjaja");
        turista1.mensajeCliente();
    }
}
