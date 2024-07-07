package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.app.web.entity.Usuario;
import com.keepcoding.app.web.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/")
	public String loginFrom(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuario", usuario);
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute Usuario usuario, Model model) {
		Usuario loggedUser = usuarioService.verificarUsuario(usuario.getUsername(), usuario.getPassword());
		if (loggedUser != null) {
			loggedUser.setActivo(true);
			usuarioService.crearUsuario(loggedUser);
			model.addAttribute("usuario", loggedUser);
			return "redirect:/listaAlumnos";
		} else {
			model.addAttribute("error", "Invalid username or password");
			return "redirect:/";
		}
	}

	@GetMapping("/registrarUsuario")
	public String registrarUsuario(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuario", usuario);
		return "registrar_usuario";
	}

	@PostMapping("/saveUsuario")
	public String saveUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.crearUsuario(usuario);
		return "redirect:/";
	}
}
