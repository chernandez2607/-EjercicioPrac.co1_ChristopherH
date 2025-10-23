/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.service;

/**
 *
 * @author ex1hernach
 */
import Biblioteca.domain.categoria;
import java.util.List;
import java.util.Optional;


public interface categoriaService {
List<categoria> listar();
categoria guardar(categoria c);
Optional<categoria> porId(Long id);
void eliminar(Long id);
}