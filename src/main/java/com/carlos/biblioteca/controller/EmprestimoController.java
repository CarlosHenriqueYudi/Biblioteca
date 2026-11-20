package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    @GetMapping
    public String inicio(Model model) {
        model.addAttribute("emprestimos", emprestimos);
        return "emprestimos/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return "redirect:/emprestimos";
    }

    @GetMapping("/emprestimos")
    public String exibirEmprestimo(Model model){

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setRetirada("15/11/2026");
        emprestimo.setDevolucao("20/11/2026");

        model.addAttribute("emprestimo", emprestimo);

        return "emprestimo";
    }

    @PostMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice) {
        if (indice >= 0 && indice < emprestimos.size()) {
            emprestimos.remove(indice);
        }
        return "redirect:/emprestimos";
    }
}
