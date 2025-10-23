/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.service;

/**
 *
 * @author ex1hernach
 */
import Biblioteca.domain.libro;
import java.util.List;
import java.util.Optional;


public interface libroService {
List<libro> listar();
List<libro> buscar(String q);
Optional<libro> porId(Long id);
libro guardar(libro l);
void eliminar(Long id);
}