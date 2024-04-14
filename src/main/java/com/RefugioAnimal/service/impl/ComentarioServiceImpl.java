package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.dao.ComentarioDao;
import com.RefugioAnimal.domain.Comentario;
import com.RefugioAnimal.service.ComentarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioDao comentarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Comentario> getComentarios(boolean activos) {
        List<Comentario> lista = comentarioDao.findAll();

        if (activos) {
            lista.removeIf(c -> !c.isActivo());
        }

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Comentario getComentario(Comentario comentario) {
        return comentarioDao.findById(comentario.getIdComentario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Comentario comentario) {
        comentarioDao.save(comentario);
    }


}