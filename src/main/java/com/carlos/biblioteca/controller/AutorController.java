package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @GetMapping
    public String inicio() {
        return "autores/inicio";
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
}
