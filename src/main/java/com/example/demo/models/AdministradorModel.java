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
@Table(name= "administrador")
public class AdministradorModel 
{
	//prueba git 3.1
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long idAdministrador;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String cedula;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String telefono;
	
	@JsonIgnore
	@OneToMany(mappedBy = "administrador")
	private List<DocumentoModel> documento;
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_login")
	private LoginModel login;
	
	
	
	
	
	
	
	

}

