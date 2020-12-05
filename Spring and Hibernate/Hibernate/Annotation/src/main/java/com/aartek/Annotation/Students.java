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
public class Students {
	
	@Id
	@Column
	private int studentId;
	
	@Column
	private String studentName;
	
	@Column
	private int marks;
	
	@ManyToMany(targetEntity=Courses.class,cascade=CascadeType.ALL)
	@JoinTable(name="Students_Courses",joinColumns=@JoinColumn(name="St_id_fk",referencedColumnName="studentId"),
	inverseJoinColumns=@JoinColumn(name="cs_id_fk",referencedColumnName="courseId"))
	private Set courses;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	} 

}
