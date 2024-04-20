package com.RefugioAnimal.dao;

import com.RefugioAnimal.domain.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormularioDao extends JpaRepository<Formulario, Long>{
    
}