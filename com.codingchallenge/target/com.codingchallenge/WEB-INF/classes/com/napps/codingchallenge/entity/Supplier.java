package com.napps.codingchallenge.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "supplier")
@Setter
@Getter
public class Supplier {

	
	@Id
	@Column(name = "supplier_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "vatNumber")
	private Int vatNumber;
	
	@Column(name = "irsOffice")
	private String irsOffice;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "zipCode")
	private Int zipCode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
}