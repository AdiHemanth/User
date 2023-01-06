package com.ex.userapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Darling")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String un;
	private String pwd;
	private String Name;
	private String Sal;
	private String Phone;
	private String EMail;
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSal() {
		return Sal;
	}
	public void setSal(String sal) {
		Sal = sal;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", un=" + un + ", pwd=" + pwd + ", Name=" + Name + ", Sal=" + Sal + ", Phone=" + Phone
				+ ", EMail=" + EMail + ", Address=" + Address + "]";
	}
	
}
