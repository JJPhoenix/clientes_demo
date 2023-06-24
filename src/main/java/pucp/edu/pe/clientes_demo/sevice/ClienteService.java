package pucp.edu.pe.clientes_demo.sevice;

import pucp.edu.pe.clientes_demo.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> buscarCliente(String dni, String apellidoPaterno);
    Cliente registrarCliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni);
    Cliente actualizarCliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni);
    Cliente eliminarCliente(String dni);
}
