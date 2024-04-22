package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.dao.SolicitudDao;
import com.RefugioAnimal.domain.Solicitud;
import com.RefugioAnimal.service.SolicitudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class SolicitudServiceImpl implements SolicitudService{
    
    @Autowired
    private SolicitudDao solicitudDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Solicitud> getSolicitudes(boolean activos) {
        List<Solicitud> lista = solicitudDao.findAll();
        
        if(activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Solicitud getSolicitud(Solicitud solicitud) {
        return solicitudDao.findById(solicitud.getIdSolicitud()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Solicitud solicitud) {
        solicitudDao.save(solicitud);
    }

    @Override
    @Transactional
    public void delete(Solicitud solicitud) {
        solicitudDao.delete(solicitud);
    }
}
