package com.RefugioAnimal.service.impl;

import com.RefugioAnimal.dao.FormularioDao;
import com.RefugioAnimal.domain.Formulario;
import com.RefugioAnimal.service.FormularioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormularioServiceImpl implements FormularioService{
    
    @Autowired
    private FormularioDao formularioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Formulario> getFormularios(boolean activos) {
        List<Formulario> lista = formularioDao.findAll();
        
        if(activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Formulario getFormulario(Formulario formulario) {
        return formularioDao.findById(formulario.getIdFormulario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Formulario formulario) {
        formularioDao.save(formulario);
    }

    @Override
    @Transactional
    public void delete(Formulario formulario) {
        formularioDao.delete(formulario);
    }
}
