package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "Roles")
public class RolModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	@Column(unique = true, nullable = false)
	private String nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "rol")
	private List<UsuarioModel> usuario;
	


	public RolModel() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<UsuarioModel> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<UsuarioModel> usuario) {
		this.usuario = usuario;
	}	
	
	

}
