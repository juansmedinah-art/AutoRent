public class pruebas {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("AutoRent", 900123456, "Armenia, Quindio");

        empresa.registrarCliente(new Residente("juan", "123", "juan@correo.com", "manzanita"));
        empresa.registrarCliente(new Turista("pepe", "P321", "pepe@correo.com", "VISA-001"));

        empresa.registrarVehiculo(new Carro("ABC123", "Mazda", "3", 2022, Estado.BUENO, 4));
        empresa.registrarVehiculo(new Moto("XYZ12A", "Yamaha", "FZ", 2023, Estado.BUENO, "150"));
        empresa.registrarVehiculo(new Camioneta("DEF456", "Chevrolet", "NPR", 2021, Estado.MALO, 3500));

        empresa.consultarClientes();
        empresa.consultarVehiculos();
        System.out.println();

        empresa.registrarAlquiler(1, "123", "ABC123", 3);
        empresa.registrarAlquiler(2, "P321", "XYZ12A", 2);
        empresa.registrarAlquiler(3, "123", "DEF456", 1);

        empresa.consultarAlquileres();

        System.out.println("Costo 1: "+empresa.calcularCostoAlquiler(1));
        System.out.println("Costo 2: "+empresa.calcularCostoAlquiler(2));
        System.out.println("Costo 3: "+empresa.calcularCostoAlquiler(3));
    }
}
