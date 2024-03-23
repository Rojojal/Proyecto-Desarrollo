package com.RefugioAnimal.dao;

import com.RefugioAnimal.domain.Visita;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VisitaDao extends JpaRepository<Visita, Long>{
    
}
