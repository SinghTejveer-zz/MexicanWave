package com.maxicanwave.modal;

public class User {
	
	private int id;
	private String name;
	private String phone;
	private String imei;
	private String user;
	private String pass;
	
	
	
	
	public User() {
		
	}
	public User(int id, String name, String phone, String imei, String user, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.imei = imei;
		this.user = user;
		this.pass = pass;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	

}
