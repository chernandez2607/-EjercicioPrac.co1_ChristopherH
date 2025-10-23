/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.service;

/**
 *
 * @author ex1hernach
 */



import Biblioteca.domain.queja;
import Biblioteca.repository.quejaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class quejaService {
    
    private final quejaRepository repository;
    
    public quejaService(quejaRepository repository) {
        this.repository = repository;
    }
    
    public List<queja> listar() {
        return repository.findAll();
    }
    
    public queja guardar(queja q) {
        return repository.save(q);
    }
    
    public Optional<queja> porId(Long id) {
        return repository.findById(id);
    }
    
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
