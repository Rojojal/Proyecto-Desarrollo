
package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Registro;
import java.util.List;


public interface RegistroService {
    public List<Registro> getRegistros(boolean activos);
    
    public Registro getRegistro(Registro registro);
    
    public void save(Registro registro);
    
    public void delete(Registro registro);

    public void saveRegistro(Registro registro);

    public void deleteRegistro(Long idRegistro);
    
} //holaaa