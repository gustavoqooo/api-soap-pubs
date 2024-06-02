package pe.edu.cibertec.api_soap_pubs.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddomicilio;
    private String descdomicilio;
    private Integer nrodomicilio;
    private String refdomicilio;
}
