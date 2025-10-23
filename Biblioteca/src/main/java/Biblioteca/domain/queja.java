/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "quejas")
public class queja {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String asunto;
    
    private String descripcion;
    
    private String usuario;
    
    @Column(name = "fecha_creacion")
    private String fechaCreacion;
    
    private String estado;
    
    // Constructor vacío (requerido por JPA)
    public queja() {
    }
    
    // Constructor con parámetros
    public queja(String asunto, String descripcion, String usuario, String fechaCreacion, String estado) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }
    
    // Getters y Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getAsunto() {
        return asunto;
    }
    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
}