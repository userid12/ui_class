package com.cubic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SASHITABLE")
public class CustomerEntity {
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "cSeq", sequenceName = "CUSTOMER_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "cSeq")
	private Long pk;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "FIRST_NAME")
	private String firstName;

	public Long getPK() {
		return pk;

	}

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "CustomerEntity [pk=" + pk + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
