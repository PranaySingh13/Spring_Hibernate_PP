package ps;

import java.util.List;

public class WelcomeBean {

	private List studentsData;

	public void setStudentsData(List studentsData) {
		this.studentsData = studentsData;
	}
	
	public void show() {
		
		System.out.println(studentsData);
	}
	
}
