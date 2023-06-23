package pucp.edu.pe.clientes_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pucp.edu.pe.clientes_demo.dto.ClienteRequest;
import pucp.edu.pe.clientes_demo.model.Cliente;
import pucp.edu.pe.clientes_demo.sevice.ClienteService;
import pucp.edu.pe.clientes_demo.sevice.ClienteServiceImpl;

import java.util.ArrayList;

@RestController
public class ControllerCliente {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/buscarCliente")
    ArrayList<Cliente> buscarCliente(@RequestBody ClienteRequest clienteRequest){
        ArrayList<Cliente> clientes = new ArrayList<>();
         return clientes;
    }

    @PostMapping("/registrarCliente")
    void registrarCliente(@RequestBody ClienteRequest clienteRequest){

    }

    @PutMapping("/actualizarCliente")
    void actualizarCliente(){

    }

    @DeleteMapping("/eliminarCliente")
    void eliminarCliente(){

    }
}
