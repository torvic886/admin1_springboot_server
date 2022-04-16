package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.RolModel;
import com.example.demo.services.RolService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/rol")
public class RolController 
{
	@Autowired
	RolService rolService;
	
	 @GetMapping()
	 public ArrayList<RolModel> obtenerRoles()
	 {
		 return rolService.obtenerRoles();
	 }
	 
	 @PostMapping()
	 public RolModel guardarRol(@RequestBody RolModel rol)
	 {
		 rol.setNombre(rol.getNombre().toUpperCase());
		 return rolService.guardarRol(rol);
	 }

}
