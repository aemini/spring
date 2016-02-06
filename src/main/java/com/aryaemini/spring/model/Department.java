package com.aryaemini.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "abbrevation", nullable = false)
	private String abbrevation;

	@Column(name = "email", nullable = true)
	private String email;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return this.abbrevation;
	}

	public void setAbbrevation(String abbr) {
		this.abbrevation = abbr;
	}

	@Override
	public String toString() {
		return "Department [id=" + id
			+ ",name=" + name
			+ ",abbrevation=" + abbrevation
			+ ",email=" + email
			+ "]";
	}

}
