package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @GetMapping
    public String inicio() {
        return "categorias/inicio";
    }
    @GetMapping("/categorias")
    public String exibirCategoria(Model model){

        Categoria categoria = new Categoria();
        categoria.setGenero("Narrativo");
        categoria.setArea("Literatura");

        model.addAttribute("categoria", categoria);

        return "categoria";
    }
}
