package ps;

import java.util.Set;

public class Vendor {

	private int vendorId;
	private String vendorName;
	private Set child;
	
	public Set getChild() {
		return child;
	}
	public void setChild(Set child) {
		this.child = child;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
}
