/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.controllers;

/**
 *
 * @author ex1hernach
 */
import Biblioteca.domain.categoria;
import Biblioteca.service.categoriaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/categorias")
public class categoriaControllers {


private final categoriaService service;


public categoriaControllers(categoriaService service) { this.service = service; }


@GetMapping
public String listar(Model model) {
model.addAttribute("categorias", service.listar());
model.addAttribute("categoria", new categoria());
return "categorias/list";
}


@PostMapping
public String crear(@Valid @ModelAttribute("categoria") categoria categoria,
BindingResult br, Model model) {
if (br.hasErrors()) {
model.addAttribute("categorias", service.listar());
return "categorias/list";
}
service.guardar(categoria);
return "redirect:/categorias";
}


@PostMapping("/{id}/eliminar")
public String eliminar(@PathVariable Long id) {
service.eliminar(id);
return "redirect:/categorias";
}
}