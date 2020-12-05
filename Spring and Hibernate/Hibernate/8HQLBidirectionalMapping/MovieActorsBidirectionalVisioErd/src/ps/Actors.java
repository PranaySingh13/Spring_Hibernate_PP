package ps;

public class Actors {

	private int actorId;
	private String actorName;
	private int foreignId;
	private Movie parentObject;
	
	public int getForeignId() {
		return foreignId;
	}
	public void setForeignId(int foreignId) {
		this.foreignId = foreignId;
	}
	
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
