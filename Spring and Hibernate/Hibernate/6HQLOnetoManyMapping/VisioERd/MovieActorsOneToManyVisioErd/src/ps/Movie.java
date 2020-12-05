package ps;

import java.util.Set;

public class Movie {

	private int movieId;
	private String movieName;
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
