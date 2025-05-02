package com.cjc.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int userId;
	private String username;
	private String password;
	private String email;
	private int age;
	private String address;
	@Lob
	@Column(length =999999999)
	private  byte[]  profileImage;
	@Lob
	@Column(length =999999999)
	private byte[] adharCard;
	
}
