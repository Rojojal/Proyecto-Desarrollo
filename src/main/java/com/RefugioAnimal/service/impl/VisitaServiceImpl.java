package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.dao.VisitaDao;
import com.RefugioAnimal.domain.Visita;
import com.RefugioAnimal.service.VisitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VisitaServiceImpl implements VisitaService{
    
    @Autowired
    private VisitaDao visitaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Visita> getVisitas(boolean activos) {
        List<Visita> lista = visitaDao.findAll();
        
        if(!activos) {//muestra las inactivas
            //remover si esta activo!!!
            lista.removeIf(c -> c.isActivo());
        }
        
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Visita getVisita(Visita visita) {
        return visitaDao.findById(visita.getIdVisita()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Visita visita) {
        visitaDao.save(visita);
    }
    
}