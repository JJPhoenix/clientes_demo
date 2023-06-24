package pucp.edu.pe.clientes_demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long codigo;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "apellidoPaterno")
    String apellidPaterno;

    @Column(name = "apellidoMaterno")
    String apellidoMaterno;

    @Column(name = "dni")
    String dni;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidPaterno, String apellidoMaterno, String dni) {
        this.nombre = nombre;
        this.apellidPaterno = apellidPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
    }
}
