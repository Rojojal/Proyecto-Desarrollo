/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Historial;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Extreme
 */
@Service
public interface HistorialService {
    
    public List<Historial> getHistorial(boolean activos);
    
    public Historial getHistorial(Historial historial);
    public Historial getHistorial(Long idHistorial);

    public void save(Historial historial);
    
    public void delete(Historial historial);
}
