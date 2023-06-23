package pucp.edu.pe.clientes_demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    long codigo;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "apellidoPaterno")
    String apellidPaterno;

    @Column(name = "apellidoMaterno")
    String apellidoMaterno;

    @Column(name = "dni")
    String dni;

}
