package br.com.projeto.dto;

import java.io.Serializable;
import java.util.Date;

public class Dto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer service;
	private Integer forms_id_form;
	private Integer forms_admins_id_admin;
	private ContentReg content_reg;
	private Date date_reg;
	
	public Dto() {
	
	}

	public Dto(Integer service, Integer forms_id_form, Integer forms_admins_id_admin, ContentReg content_reg,
			Date date_reg) {
		this.service = service;
		this.forms_id_form = forms_id_form;
		this.forms_admins_id_admin = forms_admins_id_admin;
		this.content_reg = content_reg;
		this.date_reg = date_reg;
	}

	public Integer getService() {
		return service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	public Integer getForms_id_form() {
		return forms_id_form;
	}

	public void setForms_id_form(Integer forms_id_form) {
		this.forms_id_form = forms_id_form;
	}

	public Integer getForms_admins_id_admin() {
		return forms_admins_id_admin;
	}

	public void setForms_admins_id_admin(Integer forms_admins_id_admin) {
		this.forms_admins_id_admin = forms_admins_id_admin;
	}

	public ContentReg getContent_reg() {
		return content_reg;
	}

	public void setContent_reg(ContentReg content_reg) {
		this.content_reg = content_reg;
	}

	public Date getDate_reg() {
		return date_reg;
	}

	public void setDate_reg(Date date_reg) {
		this.date_reg = date_reg;
	}
}
