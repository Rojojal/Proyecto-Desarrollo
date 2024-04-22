/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.HistorialMascota;
import com.RefugioAnimal.domain.Mascota;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Extreme
 */
@Service
public interface HistorialMascotaService {
    
     public List<HistorialMascota> getMascotas(boolean activos);
    
    public HistorialMascota getMascota(HistorialMascota mascota);
    public HistorialMascota getMascota(Long idMascota);

    public void save(HistorialMascota mascota);
    
    public void delete(HistorialMascota mascota);
}
