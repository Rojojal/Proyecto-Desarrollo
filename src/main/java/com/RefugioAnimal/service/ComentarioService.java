package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Comentario;
import java.util.List;

public interface ComentarioService {
   public List<Comentario> getComentarios(boolean activos);

    public Comentario getComentario(Long idComentario);

    public Comentario save(Comentario comentario);

    public void delete(Comentario comentario);

    public void deleteComentario(Long idComentario);
}