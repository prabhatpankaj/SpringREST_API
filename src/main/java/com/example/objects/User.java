package com.example.objects;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="user_id")
	private int id;
	private String frist_name;
	private String last_name;
	private String email_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFrist_name() {
		return frist_name;
	}
	public void setFrist_name(String frist_name) {
		this.frist_name = frist_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
