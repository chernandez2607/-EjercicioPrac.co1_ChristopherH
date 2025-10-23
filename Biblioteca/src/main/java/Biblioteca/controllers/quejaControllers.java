/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.controllers;

/**
 *
 * @author ex1hernach
 */


import Biblioteca.domain.queja;
import Biblioteca.service.quejaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/quejas")
public class quejaControllers {


private final quejaService service;


public quejaControllers(quejaService service) { this.service = service; }


@GetMapping("/nueva")
public String form(Model model) {
model.addAttribute("queja", new queja());
return "quejas/form";
}


@PostMapping
public String enviar(@Valid @ModelAttribute("queja") queja queja, BindingResult br) {
if (br.hasErrors()) return "quejas/form";
service.guardar(queja);
return "redirect:/?enviada";
}
}
