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
import java.time.LocalDateTime;


@Entity
@Table(name = "categoria")
public class categoria {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank
@Column(nullable = false, unique = true, length = 100)
private String nombre;


@Column(length = 255)
private String descripcion;


@Column(name = "created_at", updatable = false, insertable = false)
private LocalDateTime createdAt;


@Column(name = "updated_at", insertable = false)
private LocalDateTime updatedAt;


public categoria() {}
public categoria(String nombre) { this.nombre = nombre; }
// getters/setters
// ...
}
