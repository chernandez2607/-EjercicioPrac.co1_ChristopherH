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
public class queja {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank
private String nombreUsuario;


@NotBlank
@Column(length = 1000)
private String mensaje;


private LocalDateTime fecha = LocalDateTime.now();


public Long getId() { return id; }
public void setId(Long id) { this.id = id; }


public String getNombreUsuario() { return nombreUsuario; }
public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }


public String getMensaje() { return mensaje; }
public void setMensaje(String mensaje) { this.mensaje = mensaje; }


public LocalDateTime getFecha() { return fecha; }
public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}