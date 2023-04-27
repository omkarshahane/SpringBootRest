package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 10)
	private String courseName;
	
	@Column(length = 30)
	private String description;
	
	public Course() {}
	public Course(int id, String courseName, String description) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", description=" + description + "]";
	}
	
	
	
	
	

}
