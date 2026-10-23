import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private int nit;
    private String direccion;
    private List<Cliente> listaClientes;
    private List<Vehiculo> listaVehiculos;
    private List<Alquiler> listaAlquileres;

    public Empresa(String nombre, int nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.listaClientes = new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaAlquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public Cliente buscarCliente(String documento) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento().equals(documento)) {
                return cliente;
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    public Alquiler buscarAlquiler(int codigo) {
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler.getCodigo() == codigo) {
                return alquiler;
            }
        }
        return null;
    }

    public boolean registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getDocumento()) != null) {
            return false;
        }
        listaClientes.add(cliente);
        return true;
    }

    public boolean registrarVehiculo(Vehiculo vehiculo) {
        if (buscarVehiculo(vehiculo.getPlaca()) != null) {
            return false;
        }
        listaVehiculos.add(vehiculo);
        return true;
    }

    public Alquiler registrarAlquiler(int codigo, String documento, String placa, int numeroDias) {
        Cliente cliente = buscarCliente(documento);
        Vehiculo vehiculo = buscarVehiculo(placa);

        if (cliente == null || vehiculo == null || numeroDias <= 0) {
            return null;
        }
        if (buscarAlquiler(codigo) != null) {
            return null;
        }

        Alquiler alquiler = new Alquiler(codigo, LocalDate.now(), numeroDias, cliente, vehiculo);
        listaAlquileres.add(alquiler);
        return alquiler;
    }

    public double calcularCostoAlquiler(int codigo) {
        Alquiler alquiler = buscarAlquiler(codigo);
        if (alquiler == null) {
            return -1;
        }
        return alquiler.getVehiculo().calcularCostoAlquiler(alquiler.getNumeroDias());
    }

    public void consultarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
        }
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public void consultarVehiculos() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados");
        }
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
    }

    public void consultarAlquileres() {
        if (listaAlquileres.isEmpty()) {
            System.out.println("No hay alquileres registrados");
        }
        for (Alquiler alquiler : listaAlquileres) {
            System.out.println(alquiler);
            System.out.println("Costo total: $"+calcularCostoAlquiler(alquiler.getCodigo()));
        }
    }
}
