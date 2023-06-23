package pucp.edu.pe.clientes_demo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucp.edu.pe.clientes_demo.model.Cliente;
import pucp.edu.pe.clientes_demo.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> buscarClient(String dni, String apellidoPaterno) {
        return null;
    }

    @Override
    public Cliente registrarCliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni) {
        return null;
    }

    @Override
    public Cliente actualizaCliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni) {
        return null;
    }

    @Override
    public Cliente eliminarCliente(String dni) {
        return null;
    }
}
