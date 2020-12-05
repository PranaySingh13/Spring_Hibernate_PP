package ps;

import java.util.Set;

public class division {

	private int idDivision;
	private String name;
	private int circle_idCircle;
	
	private Address add;
	
	private Set roles;
	
	private Set subdivision;
	
	public Set getSubdivision() {
		return subdivision;
	}
	public void setSubdivision(Set subdivision) {
		this.subdivision = subdivision;
	}
	public int getCircle_idCircle() {
		return circle_idCircle;
	}
	public void setCircle_idCircle(int circle_idCircle) {
		this.circle_idCircle = circle_idCircle;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Set getRoles() {
		return roles;
	}
	public void setRoles(Set roles) {
		this.roles = roles;
	}
	public int getIdDivision() {
		return idDivision;
	}
	public void setIdDivision(int idDivision) {
		this.idDivision = idDivision;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
