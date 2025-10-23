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
import Biblioteca.repository.libroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class libroService {
    
    private final libroRepository repository;
    
    public libroService(libroRepository repository) {
        this.repository = repository;
    }
    
    public List<libro> listar() {
        return repository.findAll();
    }
    
    public libro guardar(libro l) {
        return repository.save(l);
    }
    
    public Optional<libro> porId(Long id) {
        return repository.findById(id);
    }
    
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    
    public List<libro> buscar(String termino) {

        return repository.findByTituloContainingIgnoreCase(termino);
       
    }
}