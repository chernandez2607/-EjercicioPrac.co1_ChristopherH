/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.domain;

/**
 *
 * @author ex1hernach
 */

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
public class categoria {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank
@Column(nullable = false, unique = true)
private String nombre;


public categoria() {}
public categoria(String nombre) { this.nombre = nombre; }


public Long getId() { return id; }
public void setId(Long id) { this.id = id; }


public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }

    
}
