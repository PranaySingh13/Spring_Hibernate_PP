package ps;

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
@Table(name="courses1")
public class Courses {

	@Id
	@Column(name="cid")
	private int courseId;
	
	@Column(name="cname",length=50)
	private String courseName;
	
	@Column(name="duration")
	private int duration;
	
	//@ManyToMany(targetEntity=Students.class,mappedBy="courses")
	 /*it will work only on hibernate 4 version.
	and it search the table by database table name as the table name 	are stored in small alphabets.*/ 

	@ManyToMany(targetEntity=Students.class,cascade=CascadeType.ALL)
	@JoinTable(name="Students_Courses",
	joinColumns=@JoinColumn(name="cs_id_fk",referencedColumnName="cid"),
	inverseJoinColumns=@JoinColumn(name="st_id_fk",referencedColumnName="sid"))
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
