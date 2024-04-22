package com.RefugioAnimal.dao;

import com.RefugioAnimal.domain.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudDao extends JpaRepository<Solicitud, Long>{
    
}