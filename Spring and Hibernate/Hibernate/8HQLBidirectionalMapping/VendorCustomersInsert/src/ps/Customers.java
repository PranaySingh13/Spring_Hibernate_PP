package ps;

public class Customers {

	private int customerId;
	private String customerName;
	private int foreignId;
	private Vendor parentObject;
	
	public int getForeignId() {
		return foreignId;
	}
	public void setForeignId(int foreignId) {
		this.foreignId = foreignId;
	}
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
