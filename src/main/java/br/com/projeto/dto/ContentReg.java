package br.com.projeto.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentReg implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id_form;
	private Integer admins_id_admin;
	private String title_form;
	private String description_form;
	private List<FieldsForm> fields_form = new ArrayList<>();
	private Date date_form;
		
	public ContentReg() {
		
	}

	public ContentReg(Integer id_form, Integer admins_id_admin, String title_form, String description_form,
			List<FieldsForm> fields_form, Date date_form) {
		super();
		this.id_form = id_form;
		this.admins_id_admin = admins_id_admin;
		this.title_form = title_form;
		this.description_form = description_form;
		this.fields_form = fields_form;
		this.date_form = date_form;
	}

	public Integer getId_form() {
		return id_form;
	}

	public void setId_form(Integer id_form) {
		this.id_form = id_form;
	}

	public Integer getAdmins_id_admin() {
		return admins_id_admin;
	}

	public void setAdmins_id_admin(Integer admins_id_admin) {
		this.admins_id_admin = admins_id_admin;
	}

	public String getTitle_form() {
		return title_form;
	}

	public void setTitle_form(String title_form) {
		this.title_form = title_form;
	}

	public String getDescription_form() {
		return description_form;
	}

	public void setDescription_form(String description_form) {
		this.description_form = description_form;
	}

	public List<FieldsForm> getFields_form() {
		return fields_form;
	}

	public void setFields_form(List<FieldsForm> fields_form) {
		this.fields_form = fields_form;
	}

	public Date getDate_form() {
		return date_form;
	}

	public void setDate_form(Date date_form) {
		this.date_form = date_form;
	}

}
