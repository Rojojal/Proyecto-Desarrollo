
package com.RefugioAnimal.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name= "usuario")
public class Registro  implements Serializable {
   
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_registro")
    private Long IdRegistro;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String password;
    private boolean activo;

    public Registro() {
    }

    public Registro(String nombre, String apellidos, String direccion, String email, String password, boolean activo) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.direccion = direccion;
    this.email = email;
    this.password = password;
    this.activo = activo; // Asigna el valor del parámetro activo al atributo activo
}


    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//holaaa
    
    

   
}
