/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RefugioAnimal.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Extreme
 */
@Data
@Entity 
@Table(name="mascota_historial")
public class HistorialMascota implements Serializable{

    private static final long serialVersionUID = 1L; //
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long idMascota;
    private String animal;
    private String genero;
    private String raza;
    private String nombre;
    private int edad;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public HistorialMascota() {
    }

    public HistorialMascota(String animal, String genero, String raza, String nombre, int edad, String descripcion, String rutaImagen, boolean activo) {
        this.animal = animal;
        this.genero = genero;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
}


