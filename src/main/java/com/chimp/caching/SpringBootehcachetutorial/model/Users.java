package com.chimp.caching.SpringBootehcachetutorial.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Users implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Long Salary;
	
	public Users(String name, Long salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	
}
