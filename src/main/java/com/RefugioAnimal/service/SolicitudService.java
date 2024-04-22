package com.RefugioAnimal.service;

import com.RefugioAnimal.domain.Solicitud;
import java.util.List;

public interface SolicitudService {
    
    public List<Solicitud> getSolicitudes(boolean activos);
    
    public Solicitud getSolicitud(Solicitud solicitud);
    
    public void save(Solicitud solicitud);
    
    public void delete(Solicitud solicitud);
}
