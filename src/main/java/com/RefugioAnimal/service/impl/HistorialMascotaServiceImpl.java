/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.dao.HistorialMascotaDao;
import com.RefugioAnimal.domain.HistorialMascota;
import com.RefugioAnimal.service.HistorialMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Extreme
 */
@Service
public class HistorialMascotaServiceImpl implements HistorialMascotaService{
   @Autowired
    private HistorialMascotaDao historialMascotaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<HistorialMascota> getMascotas(boolean activos) {
        List<HistorialMascota> lista = historialMascotaDao.findAll();
        
        if(activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    

    @Override
    @Transactional
    public void save(HistorialMascota mascota) {
        historialMascotaDao.save(mascota);
    }

    @Override
    @Transactional
    public void delete(HistorialMascota mascota) {
        historialMascotaDao.delete(mascota);
    }

    @Override
    public HistorialMascota getMascota(Long idMascota) {
       return historialMascotaDao.findById(idMascota).orElse(null);
    }

    @Override
     @Transactional(readOnly = true)
    public HistorialMascota getMascota(HistorialMascota mascota) {
         return historialMascotaDao.findById(mascota.getIdMascota()).orElse(null);
    }
}
