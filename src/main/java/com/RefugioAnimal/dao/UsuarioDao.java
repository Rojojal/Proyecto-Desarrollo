
package com.RefugioAnimal.dao;

import com.RefugioAnimal.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);
}