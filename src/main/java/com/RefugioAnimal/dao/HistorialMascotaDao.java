/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RefugioAnimal.dao;

import com.RefugioAnimal.domain.HistorialMascota;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Extreme
 */
public interface HistorialMascotaDao extends JpaRepository<HistorialMascota, Long> {
    
}
