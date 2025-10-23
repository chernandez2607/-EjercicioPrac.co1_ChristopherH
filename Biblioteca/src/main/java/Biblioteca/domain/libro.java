/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
/**
 *
 * @author ex1hernach
 */


@Entity
public class libro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank
private String titulo;


@NotBlank
private String autor;


@ManyToOne(optional = false, fetch = FetchType.LAZY)
@JoinColumn(name = "categoria_id")
@NotNull
private categoria categoria;


private boolean disponible = true;


public libro() {}


public libro(String titulo, String autor, categoria categoria) {
this.titulo = titulo;
this.autor = autor;
this.categoria = categoria;
}


public Long getId() { return id; }
public void setId(Long id) { this.id = id; }


public String getTitulo() { return titulo; }
public void setTitulo(String titulo) { this.titulo = titulo; }


public String getAutor() { return autor; }
public void setAutor(String autor) { this.autor = autor; }


public categoria getCategoria() { return categoria; }
public void setCategoria(categoria categoria) { this.categoria = categoria; }


public boolean isDisponible() { return disponible; }
public void setDisponible(boolean disponible) { this.disponible = disponible; }

}
