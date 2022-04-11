package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.RolModel;
import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.RolRepository;

@Service
public class RolService {
	@Autowired
	RolRepository rolRepository;
	
	public ArrayList<RolModel> obtenerRoles() {
		return (ArrayList<RolModel>) rolRepository.findAll();
	}
	
	public RolModel guardarRol(RolModel rol) {
		return rolRepository.save(rol);
	}

}
