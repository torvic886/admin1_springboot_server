package com.example.demo.models;

import java.util.List;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name= "usuarios")
public class UsuarioModel 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	
	@Column(nullable = false)
	private String nombre;

	@Column(nullable = true)
	private String cedula;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String telefono;
	
	@Column(nullable = false)
	private boolean activo;
	
	//@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_deporte")
	private RolModel rol;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "id_reporte")
//	private ReporteModel reporte;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_login")
	private LoginModel login;
	

	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<ReporteModel> reporte;
	
	
	
	public UsuarioModel() 
	{
		// TODO Auto-generated constructor stub
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isActivo() 
	{
		return activo;
	}

	public void setActivo(boolean activo) 
	{
		this.activo = activo;
	}

	public RolModel getRol() 
	{
		return rol;
	}

	public void setRol(RolModel rol) 
	{
		this.rol = rol;
	}
	

}
