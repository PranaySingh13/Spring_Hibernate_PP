package ps;

import java.util.Set;

public class distcenter_zone {

	private int idDistCenter;
	private String name;
	private int subdivision_idSubDivision;
	
	private Address add;
	
	private Set roles;
	
	public int getSubdivision_idSubDivision() {
		return subdivision_idSubDivision;
	}
	public void setSubdivision_idSubDivision(int subdivision_idSubDivision) {
		this.subdivision_idSubDivision = subdivision_idSubDivision;
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
	public int getIdDistCenter() {
		return idDistCenter;
	}
	public void setIdDistCenter(int idDistCenter) {
		this.idDistCenter = idDistCenter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
