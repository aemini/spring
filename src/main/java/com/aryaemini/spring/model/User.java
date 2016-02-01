package com.aryaemini.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 20)
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "middle_name", nullable = true)
	private String middleName;

	@Size(min = 2, max = 20)
	@Column(name = "middle_name", nullable = false)
	private String familyName;

	public int getId() {
		return this.id;
	}

	public String getName() {
		String name = this.firstName;
		if (this.middleName != null) {
			name = name + " " + this.middleName;
		}
		return name;
	}

	public String getFullName() {
		return this.getName() + " " + this.familyName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String name) {
		this.middleName = name;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String name) {
		this.familyName = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ",name=" + getName() + ",firstName=" + firstName + ",middleName=" + middleName
				+ ",familyName=" + familyName + ",fullName=" + getFullName() + "]";
	}

}
