package ps;

//child class
public class Customers {

	private int customerId;
	private String customerName;
	private int foreignId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public int getForeignId() {
		return foreignId;
	}
	public void setForeignId(int foreignId) {
		this.foreignId=foreignId;
	}
	
}
