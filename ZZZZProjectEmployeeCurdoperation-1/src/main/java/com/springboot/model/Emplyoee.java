package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Dev.Employee")
public class Emplyoee {
	// column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="middleName")
	private String middleName;
	@Column(name="email")
	private String email;
	@Column(name="mobileNumber")
	private Long mobileNumber;
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private Long pincode;
	@Column(name="deptno")
	private Integer deptno;

}
