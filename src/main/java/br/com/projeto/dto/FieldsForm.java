package br.com.projeto.dto;

import java.io.Serializable;

public class FieldsForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String type;
	private String fieldId;
	private String name;
	private String value;
	private String restrict;
		
	public FieldsForm() {
		
	}

	public FieldsForm(String type, String fieldId, String name, String value, String restrict) {
		this.type = type;
		this.fieldId = fieldId;
		this.name = name;
		this.value = value;
		this.restrict = restrict;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getRestrict() {
		return restrict;
	}

	public void setRestrict(String restrict) {
		this.restrict = restrict;
	}

}
