package com.RefugioAnimal.dao;

import com.RefugioAnimal.domain.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioDao extends JpaRepository<Comentario, Long> {

}
