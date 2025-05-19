package com.bookmanagementsystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private  String Name;
	@Column(unique = true)
	private String Email;
	private String Password;
	private int PhoneNumber;
//	private String Role;
	private LocalDateTime CreatedAt;
	private LocalDateTime UpdatedAt;
	
	public User(Long id, String name, String email, String password, int phoneNumber, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Password = password;
		PhoneNumber = phoneNumber;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		UpdatedAt = updatedAt;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	

}
