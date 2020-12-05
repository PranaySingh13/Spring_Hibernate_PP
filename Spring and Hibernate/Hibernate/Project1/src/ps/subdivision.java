package ps;

import java.util.Set;

public class subdivision {

	private int idSubDivision;
	private String name;
	private int division_idDivision;
	
	private Address add;
	
	private Set roles;
	
	private Set distcenter_zone;
	
	public Set getDistcenter_zone() {
		return distcenter_zone;
	}
	public void setDistcenter_zone(Set distcenter_zone) {
		this.distcenter_zone = distcenter_zone;
	}
	public int getDivision_idDivision() {
		return division_idDivision;
	}
	public void setDivision_idDivision(int division_idDivision) {
		this.division_idDivision = division_idDivision;
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
	public int getIdSubDivision() {
		return idSubDivision;
	}
	public void setIdSubDivision(int idSubDivision) {
		this.idSubDivision = idSubDivision;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
