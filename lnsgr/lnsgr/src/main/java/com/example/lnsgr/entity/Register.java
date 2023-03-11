package com.example.lnsgr.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
//@EntityListeners(EntityListeners.class)

public class Register {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int  id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Register(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + "]";
	}
		
	

}
