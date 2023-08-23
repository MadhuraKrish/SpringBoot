package com.Maddie.SpringbootDay4.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetail")
public class StudentDetails {
	@Id
	private int id;
	private String name;
	private String stream;
	private String mailId;
	
	public StudentDetails()
	{
		super();
	}
	public StudentDetails(int id, String name, String stream, String mailId) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.mailId = mailId;
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	
}
