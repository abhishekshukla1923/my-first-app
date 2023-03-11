package com.example.lnsgr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name ="department_id")
	private int id;
	private String name;
	private String mobileno;
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", status=" + status + "]";
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, String mobileno, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.status = status;
	}
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
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	private boolean status;

}
