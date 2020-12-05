package ps;

public class Cars implements Vehicle {

	private String fuelType;
	private int maxSpeed;
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getFuelType() {
		return fuelType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void move() {
		
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Maximum Speed:"+maxSpeed);
		System.out.println("Cars Started");
	}
	
}
