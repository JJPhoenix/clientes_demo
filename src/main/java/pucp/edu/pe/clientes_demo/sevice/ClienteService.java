package pucp.edu.pe.clientes_demo.sevice;

import org.springframework.http.ResponseEntity;
import pucp.edu.pe.clientes_demo.dto.UpdateRequest;
import pucp.edu.pe.clientes_demo.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> buscarCliente(String dni, String apellidoPaterno);
    Cliente registrarCliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni);
    ResponseEntity<Cliente> actualizarCliente(UpdateRequest updateRequest);
    Cliente eliminarCliente(long codigo);
}
