package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros = new ArrayList<>();

    @GetMapping
    public String inicio() {
        return "livros/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Livro livro) {
        livros.add(livro);
        return "redirect:/livros";
    }
    
    @GetMapping("/livro")
    public String exibirLivro(Model model){

        Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setIsbn("978-85-00-0000-0");

        model.addAttribute("livro", livro);

        return "livro/inicio";
    }
}
