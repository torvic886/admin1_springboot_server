package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "documentos")
public class DocumentoModel 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	

	
	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String telefono;
	
	@Column(nullable = false)
	private boolean activo;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_administrador")
	private AdministradorModel administrador;
	
	
	
	
	
	
	
}
