package com.RefugioAnimal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity 
@Table(name="formulario")
public class Formulario implements Serializable{
    
    private static final long serialVersionUID = 1L; //
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulario")
    private Long idFormulario;
    private int idMascota;
    private String nombreCompleto;
    private String cedula;
    private String email;
    private String telefono;
    private String motivoAdopcion;
    private String comentariosAdicionales;
    private boolean activo;
    
    
    public Formulario() {
    }

    public Formulario(int idMascota, String nombreCompleto, String cedula, String email, String telefono, String motivoAdopcion, String comentariosAdicionales, boolean activo) {
        this.idMascota = idMascota;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.motivoAdopcion = motivoAdopcion;
        this.comentariosAdicionales = comentariosAdicionales;
        this.activo = activo;
    }

    
    
}
