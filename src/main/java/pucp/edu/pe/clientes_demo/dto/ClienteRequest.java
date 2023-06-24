package pucp.edu.pe.clientes_demo.dto;

import lombok.Data;

@Data
public class ClienteRequest {
    String dni;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
}
