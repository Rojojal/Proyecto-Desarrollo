package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Comentario;
import java.util.List;

public interface ComentarioService {

    public List<Comentario> getComentarios(boolean activos);

    public Comentario getComentario(Comentario comentario);

    public void save(Comentario comentario);

}