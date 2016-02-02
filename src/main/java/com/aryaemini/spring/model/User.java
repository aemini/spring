package com.aryaemini.spring.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

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
	@Column(name = "family_name", nullable = false)
	private String familyName;
	
	@Column(name = "tckimlik", nullable = true)
	private BigInteger tckNo;
	
	@Column(name = "birth_year", nullable = true)
	private Short birthYear;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@Column(name = "created_at", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime createdAt;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@Column(name = "updated_at", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime updatedAt;

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
	
	public BigInteger getTckNo() {
		return this.tckNo;
	}
	
	public void setTckNo(BigInteger tckimlik) {
		this.tckNo = tckimlik;
	}
	
	public Short getBirthYear() {
		return this.birthYear;
	}
	
	public void setBirthYear(Short year) {
		this.birthYear = year;
	}

	public LocalDateTime getCreatedAt() {
		return this.createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return this.updatedAt;
	}

	public void setGetUpdatedAt(LocalDateTime now) {
		this.updatedAt = now;
	}

	@Override
	public String toString() {
		return "User [id=" + id
				+ ",name=" + getName()
				+ ",firstName=" + firstName
				+ ",middleName=" + middleName
				+ ",familyName="+ familyName
				+ ",fullName=" + getFullName()
				+ ",tckNo=" + tckNo
				+ ",birthYear=" + birthYear
				+ ",createdAt=" + createdAt
				+ ",updatedAt=" + updatedAt
				+ "]";
	}

}
