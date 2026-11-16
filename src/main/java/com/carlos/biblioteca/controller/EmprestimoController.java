package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @GetMapping
    public String inicio() {
        return "emprestimos/inicio";
    }
    @GetMapping("/emprestimos")
    public String exibirEmprestimo(Model model){

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setRetirada("");
        emprestimo.setDevolucao("");

        model.addAttribute("emprestimo", emprestimo);

        return "emprestimo";
    }
}
