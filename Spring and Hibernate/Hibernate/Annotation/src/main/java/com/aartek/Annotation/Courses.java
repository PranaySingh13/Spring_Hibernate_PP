package com.aartek.Annotation;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Courses {

	@Id
	@Column
	private int courseId;
	
	@Column
	private String courseName;
	
	@Column
	private int duration;
	
	@ManyToMany(targetEntity=Students.class,mappedBy="courses") /*it will work only on hibernate 4 version.
	and it search the table by database table name as the table name are stored in small alphabets.*/ 
	private Set students;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Set getStudents() {
		return students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}
	
}
