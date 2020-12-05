package ps;

import java.util.Set;

public class Company {

	private int companyId;
	private String companyName;
	private Set child;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Set getChild() {
		return child;
	}
	public void setChild(Set child) {
		this.child = child;
	}
}
