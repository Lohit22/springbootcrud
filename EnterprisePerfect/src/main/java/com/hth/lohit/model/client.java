package com.hth.lohit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class client {
	@Id
	@Column(name="idClient")
	String idClient;
	String Name;
	String LastName;
	int Age;
	int Addr;
	public String getId() {
		return idClient;
	}
	public int getAddr() {
		return Addr;
	}
	public void setAddr(int addr) {
		Addr = addr;
	}
	public void setId(String id) {
		this.idClient = id;
	}
	public String getFirstName() {
		return Name;
	}
	public void setFirstName(String firstName) {
		this.Name = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	

}
