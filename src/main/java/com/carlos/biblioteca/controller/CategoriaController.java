package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    private List<Categoria> categorias = new ArrayList<>();

    @GetMapping
    public String inicio(Model model) {
        model.addAttribute("categorias", categorias);
        return "categorias/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Categoria categoria) {
        categorias.add(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/categorias")
    public String exibirCategoria(Model model){

        Categoria categoria = new Categoria();
        categoria.setGenero("Narrativo");
        categoria.setArea("Literatura");

        model.addAttribute("categoria", categoria);

        return "categoria";
    }

    @PostMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice) {
        if (indice >= 0 && indice < categorias.size()) {
            categorias.remove(indice);
        }
        return "redirect:/categorias";
    }
}
