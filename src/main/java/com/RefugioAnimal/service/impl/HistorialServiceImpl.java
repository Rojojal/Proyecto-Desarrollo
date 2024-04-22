/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.domain.Historial;
import com.RefugioAnimal.dao.HistorialDao;
import com.RefugioAnimal.service.HistorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Extreme
 */
@Service
public class HistorialServiceImpl implements HistorialService{
    
    @Autowired
    private HistorialDao historialDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Historial> getHistorial(boolean activos) {
        List<Historial> lista = historialDao.findAll();
       
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Historial getHistorial(Historial historial) {
        return historialDao.findById(historial.getIdSolicitud()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Historial historial) {
        historialDao.save(historial);
    }

    @Override
    @Transactional
    public void delete(Historial historial) {
        historialDao.delete(historial);
    }

    @Override
    public Historial getHistorial(Long idSolicitud) {
       return historialDao.findById(idSolicitud).orElse(null);
    }
}
