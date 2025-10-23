/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.repository;

/**
 *
 * @author ex1hernach
 */
import Biblioteca.domain.queja;
import org.springframework.data.jpa.repository.JpaRepository;


public interface quejaRepository extends JpaRepository<queja, Long> { }