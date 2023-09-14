package com.example.docker.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demo")
public class Demo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public Demo(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	private String Address;
	public Demo() {
		
	}

}
