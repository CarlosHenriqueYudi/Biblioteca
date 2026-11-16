package com.carlos.biblioteca.controller;

import com.carlos.biblioteca.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public String inicio() {
        return "usuarios/inicio";
    }
    @GetMapping("/usuarios")
    public String exibirUsuario(Model model){

        Usuario usuario = new Usuario();
        usuario.setNome("Carlos");
        usuario.setCPF("123456789");

        model.addAttribute("usuario", usuario);

        return "usuario";
    }
}
