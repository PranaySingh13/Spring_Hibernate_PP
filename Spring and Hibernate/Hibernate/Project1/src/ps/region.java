package ps;

import java.util.Set;

public class region {

	private int idRegion;
	private String name;
	private int company_idCompany;
	
	private Address add;
	
	private Set roles;
	
	private Set circle;
	
	public Set getCircle() {
		return circle;
	}
	public void setCircle(Set circle) {
		this.circle = circle;
	}
	public int getCompany_idCompany() {
		return company_idCompany;
	}
	public void setCompany_idCompany(int company_idCompany) {
		this.company_idCompany = company_idCompany;
	}
	public Set getRoles() {
		return roles;
	}
	public void setRoles(Set roles) {
		this.roles = roles;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
