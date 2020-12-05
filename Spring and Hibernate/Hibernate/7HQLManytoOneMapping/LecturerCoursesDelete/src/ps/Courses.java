package ps;

public class Courses {

	private int coursesId;
	private String coursesName;
	private Lecturer parentObject;
	
	public int getCoursesId() {
		return coursesId;
	}
	public void setCoursesId(int coursesId) {
		this.coursesId = coursesId;
	}
	public String getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}
	public Lecturer getParentObject() {
		return parentObject;
	}
	public void setParentObject(Lecturer parentObject) {
		this.parentObject = parentObject;
	}
	
}
