package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "login")
public class LoginModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long idLogin;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "login")
	private List<UsuarioModel> usuario;
	
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "login")
	private List<TiendaModel> tienda;
	
	@JsonIgnore
	@OneToMany(mappedBy = "login")
	private List<AdministradorModel> administrador;
	
	

}