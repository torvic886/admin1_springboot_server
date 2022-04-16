package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tiendas")
public class TiendaModel {

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
	
	public TiendaModel() 
	{
		// TODO Auto-generated constructor stub
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
