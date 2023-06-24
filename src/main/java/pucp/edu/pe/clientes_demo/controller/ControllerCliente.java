package pucp.edu.pe.clientes_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pucp.edu.pe.clientes_demo.dto.ClienteRequest;
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
    List<Cliente> buscarCliente(@RequestBody ClienteRequest clienteRequest){
        String dni = clienteRequest.getDni();
        String apellidoPaterno = clienteRequest.getApellidoPaterno();
        return clienteService.buscarCliente(dni, apellidoPaterno);
    }

    @PostMapping("/registrarCliente")
    void registrarCliente(@RequestBody ClienteRequest clienteRequest){
        String nombre = clienteRequest.getNombre();
        String apellidoPaterno = clienteRequest.getApellidoPaterno();
        String apellidoMaterno = clienteRequest.getApellidoMaterno();
        String dni = clienteRequest.getDni();
        clienteService.registrarCliente(nombre, apellidoPaterno, apellidoMaterno, dni);
    }

    @PutMapping("/actualizarCliente")
    void actualizarCliente(@RequestBody ClienteRequest clienteRequest){
        String nombre = clienteRequest.getNombre();
        String apellidoPaterno = clienteRequest.getApellidoPaterno();
        String apellidoMaterno = clienteRequest.getApellidoMaterno();
        String dni = clienteRequest.getDni();
        clienteService.actualizarCliente(nombre, apellidoPaterno, apellidoMaterno, dni);
    }

    @DeleteMapping("/eliminarCliente")
    void eliminarCliente(@RequestParam("dni") String dni){
        clienteService.eliminarCliente(dni);
    }
}
