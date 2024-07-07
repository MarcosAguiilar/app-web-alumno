package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Usuario;

public interface UsuarioService {

	public Usuario crearUsuario(Usuario usuario);
	
	public Usuario verificarUsuario(String username, String password);
	
}
