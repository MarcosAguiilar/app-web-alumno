package com.keepcoding.app.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Usuario;
import com.keepcoding.app.web.repository.UsuarioRepository;
import com.keepcoding.app.web.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario verificarUsuario(String username, String password) {
		return usuarioRepository.findByUsernameAndPassword(username, password);
	}

}
