package pucp.edu.pe.clientes_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pucp.edu.pe.clientes_demo.dto.ClienteRequest;
import pucp.edu.pe.clientes_demo.dto.UpdateRequest;
import pucp.edu.pe.clientes_demo.model.Cliente;
import pucp.edu.pe.clientes_demo.sevice.ClienteService;
import pucp.edu.pe.clientes_demo.sevice.ClienteServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerCliente {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/buscarCliente")
    ResponseEntity<List<Cliente>> buscarCliente(@RequestBody ClienteRequest clienteRequest){
        List<Cliente> _clientes = clienteService.buscarCliente(clienteRequest.getDni(), clienteRequest.getApellidoPaterno());
        return new ResponseEntity<>(_clientes, HttpStatus.OK);
    }

    @PostMapping("/registrarCliente")
    ResponseEntity<Cliente> registrarCliente(@RequestBody ClienteRequest clienteRequest){
        Cliente _cliente = clienteService.registrarCliente(clienteRequest.getNombre(),
                clienteRequest.getApellidoPaterno(),
                clienteRequest.getApellidoMaterno(),
                clienteRequest.getDni());
        return new ResponseEntity<>(_cliente, HttpStatus.OK);
    }

    @PutMapping("/actualizarCliente")
    ResponseEntity<Cliente> actualizarCliente(@RequestBody UpdateRequest updateRequest){
        return clienteService.actualizarCliente(updateRequest);
    }

    @DeleteMapping("/eliminarCliente/{codigo}")
    ResponseEntity<HttpStatus> eliminarCliente(@PathVariable("codigo") long codigo){
        try {
            clienteService.eliminarCliente(codigo);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
