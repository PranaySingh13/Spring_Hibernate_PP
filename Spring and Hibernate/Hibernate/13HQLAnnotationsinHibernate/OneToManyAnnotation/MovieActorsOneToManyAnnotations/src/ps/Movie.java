package ps;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {

	@Id
	@Column(name="mid")
	private int movieId;
	
	@Column(name="mname",length=50)
	private String movieName;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Actors.class, cascade=CascadeType.ALL)
	@JoinColumn(name="fId",referencedColumnName="mid")
	private Set childObject;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Set getChildObject() {
		return childObject;
	}
	public void setChildObject(Set childObject) {
		this.childObject = childObject;
	}

}
