package ps;

import java.util.Set;

public class circle {

	private int idCircle;
	private String name;
	private int region_idRegion;
	
	private Address add;
	
	private Set roles;
	
	private Set division;

	public Set getDivision() {
		return division;
	}
	public void setDivision(Set division) {
		this.division = division;
	}
	public Set getRoles() {
		return roles;
	}
	public void setRoles(Set roles) {
		this.roles = roles;
	}
	public int getRegion_idRegion() {
		return region_idRegion;
	}
	public void setRegion_idRegion(int region_idRegion) {
		this.region_idRegion = region_idRegion;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getIdCircle() {
		return idCircle;
	}
	public void setIdCircle(int idCircle) {
		this.idCircle = idCircle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
