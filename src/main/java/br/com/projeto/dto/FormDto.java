package br.com.projeto.dto;

public class FormDto {

	public String nombre;
	public String email;
	public String tipodoc;
	public String numdoc;
		
	public FormDto() {
		
	}

	public FormDto(String nombre, String email, String tipodoc, String numdoc) {
		this.nombre = nombre;
		this.email = email;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
}
