package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public String inicio(Model model) {
        model.addAttribute("usuarios", usuarios);
        return "usuarios/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Usuario usuario) {
        usuarios.add(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios")
    public String exibirUsuario(Model model){

        Usuario usuario = new Usuario();
        usuario.setNome("Carlos");
        usuario.setCPF("123456789");

        model.addAttribute("usuario", usuario);

        return "usuario";
    }

    @PostMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
        }
        return "redirect:/usuarios";
    }
}
