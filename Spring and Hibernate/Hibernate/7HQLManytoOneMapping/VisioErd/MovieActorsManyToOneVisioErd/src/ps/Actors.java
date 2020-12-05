package ps;

public class Actors {


	private int actorId;
	private String actorName;
	private Movie parentObject;
	
	public Movie getParentObject() {
		return parentObject;
	}
	public void setParentObject(Movie parentObject) {
		this.parentObject = parentObject;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

}
