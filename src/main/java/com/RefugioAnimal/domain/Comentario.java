package com.RefugioAnimal.domain;

import com.google.cloud.Timestamp;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "comentarios")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Long idComentario;
    private String contenido;
    //private Timestamp fecha_creacion;
    private boolean activo;

    public Comentario() {
    }

    public Comentario(String contenido, boolean activo) {
        this.contenido = contenido;
        this.activo = activo;
    }
    
//        public Comentario(String contenido, Timestamp fecha_creacion) {
//        this.contenido = contenido;
//        this.fecha_creacion = fecha_creacion;
//    }
    
}
