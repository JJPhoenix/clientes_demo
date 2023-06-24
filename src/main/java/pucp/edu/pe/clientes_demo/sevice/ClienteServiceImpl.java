package pucp.edu.pe.clientes_demo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import pucp.edu.pe.clientes_demo.dto.UpdateRequest;
import pucp.edu.pe.clientes_demo.model.Cliente;
import pucp.edu.pe.clientes_demo.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> buscarCliente(String dni, String apellidoPaterno) {
        List<Cliente> _clientes = clienteRepository.findByDniOrApellidPaterno(dni,apellidoPaterno);
        return _clientes;
    }

    @Override
    public Cliente registrarCliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni) {
        Cliente _cliente = clienteRepository.save(new Cliente(nombre,apellidPaterno,apellidoMaterno,dni));
        return _cliente;
    }

    @Override
    public ResponseEntity<Cliente> actualizarCliente(UpdateRequest request) {
        Optional<Cliente> clienteData = clienteRepository.findById(request.getCodigo());
        if (clienteData.isPresent()){
            Cliente _cliente = clienteData.get();
            _cliente.setCodigo(request.getCodigo());
            _cliente.setNombre(request.getNombre());
            _cliente.setApellidPaterno(request.getApellidoPaterno());
            _cliente.setApellidoMaterno(request.getApellidoMaterno());
            _cliente.setDni(request.getDni());
            return new ResponseEntity<>(clienteRepository.save(_cliente),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Cliente eliminarCliente(long codigo) {
        clienteRepository.deleteById(codigo);
        return null;
    }
}
