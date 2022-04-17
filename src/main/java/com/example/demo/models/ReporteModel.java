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
@Table(name = "reporte")
public class ReporteModel 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	
	@Column(nullable = false)
	private String registroReporte;

	@Column(nullable = false)
	private String tipoReporte;
	
	@Column(nullable = false)
	private String descripción;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tienda")
	private TiendaModel tienda ;
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	private UsuarioModel usuario;
	
	
	
}
