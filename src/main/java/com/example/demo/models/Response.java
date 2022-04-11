package com.example.demo.models;

import java.util.List;

public class Response {
	private boolean ok;
	private int limite;
	private int pagina;
	private int results;
	private long registros;
	private List<UsuarioModel> usuarios;

	public Response() {
		// TODO Auto-generated constructor stub		
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioModel> result) {
		this.usuarios = result;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public int getResults() {
		return results;
	}

	public void setResults(int results) {
		this.results = results;
	}

	public long getRegistros() {
		return registros;
	}

	public void setRegistros(long registros) {
		this.registros = registros;
	}	
	

}
