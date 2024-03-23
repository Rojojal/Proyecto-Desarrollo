package com.RefugioAnimal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity 
@Table(name="visita")
public class Visita implements Serializable{
    
    private static final long serialVersionUID = 1L; //
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visita")
    private Long idVisita;
    private String fecha;
    private String hora;
    private String nombre;
    private String telefono;
    private boolean activo;

    public Visita() {
    }

    public Visita(String fecha, String hora, String nombre, String telefono, boolean activo) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.telefono = telefono;
        this.activo = activo;
    }

    
    
}