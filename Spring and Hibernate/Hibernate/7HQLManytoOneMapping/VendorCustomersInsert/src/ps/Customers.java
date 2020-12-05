package ps;

public class Customers {

	private int customerId;
	private String customerName;
	private Vendor parentObject;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Vendor getParentObject() {
		return parentObject;
	}
	public void setParentObject(Vendor parentObject) {
		this.parentObject = parentObject;
	}
	
}
