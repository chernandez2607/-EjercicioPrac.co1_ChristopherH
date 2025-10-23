/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.repository;

import Biblioteca.domain.libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface libroRepository extends JpaRepository<libro, Long> {
    
    // Agrega este método
    List<libro> findByTituloContainingIgnoreCase(String titulo);
}