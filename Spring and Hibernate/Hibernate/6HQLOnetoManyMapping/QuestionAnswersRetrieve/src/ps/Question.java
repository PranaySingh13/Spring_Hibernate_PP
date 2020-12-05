package ps;

import java.util.Set;

public class Question {

	private int questionId;
	private String questionName;
	private Set child;
	
	public void setQuestionId(int questionId) {
		this.questionId=questionId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionName(String questionName) {
		this.questionName=questionName;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setChild(Set child ) {
		this.child=child;
	}
	public Set getChild() {
		return child;
	}
	 
}
