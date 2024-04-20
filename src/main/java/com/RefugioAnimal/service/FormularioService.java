package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Formulario;
import java.util.List;

public interface FormularioService {
    
    public List<Formulario> getFormularios(boolean activos);
    
    public Formulario getFormulario(Formulario formulario);
    
    public void save(Formulario formulario);
    
    public void delete(Formulario formulario);
}
