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
import Biblioteca.repository.categoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class categoriaService {
    
    private final categoriaRepository repository;
    
    // Constructor
    public categoriaService(categoriaRepository repository) {
        this.repository = repository;
    }
    
    // Implementa los métodos
    public List<categoria> listar() {
        return repository.findAll();
    }
    
    public categoria guardar(categoria c) {
        return repository.save(c);
    }
    
    public Optional<categoria> porId(Long id) {
        return repository.findById(id);
    }
    
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}