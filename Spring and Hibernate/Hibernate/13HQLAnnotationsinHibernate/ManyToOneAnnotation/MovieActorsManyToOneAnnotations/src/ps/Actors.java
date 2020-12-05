package ps;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="actors1")
public class Actors {
	
	@Id
	@Column(name="aid")
	private int actorId;
	
	@Column(name="aname",length=50)
	private String actorName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fid", referencedColumnName="mid")
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
