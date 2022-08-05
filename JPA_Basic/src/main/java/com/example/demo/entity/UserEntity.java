package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class UserEntity { //proxy 구조로 JPA가 사용하는데 default constructor가 필요
	@Id //primarykey 지정
	private String email;
	
	private String name;
	//db에서는 snakecase java에서는 camelcase라 매핑
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	public String getEmail() {return email;}
	
	public String getName() {return name;}
	
	public LocalDateTime getCreatedAt() {return createdAt;}
	
	public LocalDateTime getUpdatedAt() {return updatedAt;}
	
	public UserEntity(String email, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.email = email;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public UserEntity() {
		
	}
}
