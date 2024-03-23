package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Visita;
import java.util.List;

public interface VisitaService {
    
    public List<Visita> getVisitas(boolean activos);
    
    public Visita getVisita(Visita visita);
    
    public void save(Visita visita);
    
}
