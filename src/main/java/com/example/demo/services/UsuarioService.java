package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public Page<UsuarioModel> obtenerUsuarios(int pagina, int limite) {
		PageRequest paginado = PageRequest.of(pagina, limite);
		return (Page<UsuarioModel>) usuarioRepository.findAll(paginado);
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Optional<UsuarioModel> usuarioById(long id) {
		return usuarioRepository.findById(id);
	}
	
	public ArrayList<UsuarioModel> obtenerPorNombre(String nombre) {
		return usuarioRepository.findByNombre(nombre);
	}
	
	public boolean eliminarById(long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
