package com.RefugioAnimal.domain;


import com.google.cloud.Timestamp;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name = "comentario")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Long idComentario;
    private int usuario_id;
    private String contenido;
    private Timestamp fecha_creacion;

    public Comentario() {
    }

    public Comentario(int usuario_id, String contenido, Timestamp fecha_creacion) {
        this.usuario_id = usuario_id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
    }

    

}
