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

    @Transactional(readOnly = true)
    public Comentario getComentario(Long idComentario) {
        return comentarioDao.findById(idComentario).orElse(null);
    }

    @Transactional
    public Comentario save(Comentario comentario) {
        return comentarioDao.save(comentario);
    }

    @Transactional
    public void delete(Comentario comentario) {
        comentarioDao.delete(comentario);
    }

    @Transactional
    public void deleteComentario(Long idComentario) {
        comentarioDao.deleteById(idComentario);
    }

    @Override
    public List<Comentario> getComentarios(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}