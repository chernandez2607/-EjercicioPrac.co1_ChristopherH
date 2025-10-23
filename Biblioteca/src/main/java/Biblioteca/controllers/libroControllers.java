
package Biblioteca.controllers;


import Biblioteca.domain.libro;
import Biblioteca.service.categoriaService;
import Biblioteca.service.libroService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/libros")

public class libroControllers {


private final libroService libros;
private final categoriaService categorias;

public libroControllers(libroService libros, categoriaService categorias) {
this.libros = libros;
this.categorias = categorias;
}


@GetMapping
public String listar(@RequestParam(value = "q", required = false) String q, Model model) {
model.addAttribute("libros", q == null ? libros.listar() : libros.buscar(q));
model.addAttribute("q", q);
return "libros/list";
}


@GetMapping("/nuevo")
public String nuevo(Model model) {
model.addAttribute("libro", new libro());
model.addAttribute("categorias", categorias.listar());
return "libros/form";
}


@PostMapping
public String crear(@Valid @ModelAttribute("libro") libro libro, BindingResult br, Model model) {
if (br.hasErrors()) {
model.addAttribute("categorias", categorias.listar());
return "libros/form";
}
libros.guardar(libro);
return "redirect:/libros";
}


@GetMapping("/editar/{id}")
public String editar(@PathVariable Long id, Model model) {
libro l = libros.porId(id).orElseThrow(() -> new IllegalArgumentException("Libro no encontrado"));
model.addAttribute("libro", l);
model.addAttribute("categorias", categorias.listar());
return "libros/form";
}


@PostMapping("/{id}")
public String actualizar(@PathVariable Long id, @Valid @ModelAttribute("libro") libro libro, BindingResult br, Model model) {
if (br.hasErrors()) {
model.addAttribute("categorias", categorias.listar());
return "libros/form";
}
libro.setId(id);
libros.guardar(libro);
return "redirect:/libros";
}


@PostMapping("/{id}/eliminar")
public String eliminar(@PathVariable Long id) {
libros.eliminar(id);
return "redirect:/libros";
}
}