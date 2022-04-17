package com.example.demo.models;

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
@Table(name= "tienda")
public class TiendaModel 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	
	@Column(nullable = false)
	private String nit;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String descripcionReporte;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tienda")
	private List<ReporteModel> reporte;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_login")
	private LoginModel login;
	
	
	
	public TiendaModel() 
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionReporte() {
		return descripcionReporte;
	}

	public void setDescripcionReporte(String descripcionReporte) {
		this.descripcionReporte = descripcionReporte;
	}
	
	
}
