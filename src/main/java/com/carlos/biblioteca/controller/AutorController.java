package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {

    private List<Autor> autores = new ArrayList<>();

    @GetMapping
    public String inicio(Model model) {
        model.addAttribute("autores", autores);
        return "autores/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Autor autor) {
        autores.add(autor);
        return "redirect:/autores";
    }

    @GetMapping("/autores")
    public String exibirAutor(Model model){

        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        autor.setNacionalidade("Brasileiro");
        autor.setObras("Dom Casmurro");

        model.addAttribute("autor", autor);

        return "autor";
    }

    @PostMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice) {
        if (indice >= 0 && indice < autores.size()) {
            autores.remove(indice);
        }
        return "redirect:/autores";
    }
}
