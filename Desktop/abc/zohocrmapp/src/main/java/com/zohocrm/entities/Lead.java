package com.zohocrm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@Column(name="first_name",nullable=false, length=45)
	private String firstName;
	
	@Column(name="last_name",nullable=false, length=45)
	private String lastName;
	
	@Column(name="email",nullable=false, length=128, unique=true )
	private String email;
	
	@Column(name="mobile",length=10, nullable=false)
	private long mobile;
	private String source;
		
	





	public static void main(String[] args) {
		

	}

}
