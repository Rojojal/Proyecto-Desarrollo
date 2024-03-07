
package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.dao.RegistroDao;
import com.RefugioAnimal.domain.Registro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class RegistroServiceImpl {
    @Autowired
    private RegistroDao registroDao;
    
    @Transactional(readOnly = true)
    public List<Registro> getRegistros(boolean activos) {
        List<Registro> lista = registroDao.findAll();
        
        if(activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    @Transactional(readOnly = true)
    public Registro getRegistro(Registro registro) {
        return registroDao.findById(registro.getIdRegistro()).orElse(null);
    }
    
    
    @Transactional
    public void save(Registro registro) {
        registroDao.save(registro);
    }

    @Transactional
    public void delete(Registro registro) {
        registroDao.delete(registro);
    }//holaaa
}
