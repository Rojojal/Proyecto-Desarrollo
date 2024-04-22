package com.RefugioAnimal.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity 
@Table(name="solicitud_historial")
public class Historial implements Serializable {
    
    private static final long serialVersionUID = 1L; //
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private Long idSolicitud;
    private int idMascota;
    private String nombreCompleto;
    private String email;
    private String telefono;

    public Historial() {
    }

    public Historial( int idMascota, String nombreCompleto, String email, String telefono) {
        this.idMascota = idMascota;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
    }
    
    
    
}
