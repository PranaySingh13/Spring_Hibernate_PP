package ps;

public class Bus {

	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void move() {
		System.out.println("Maximum Speed:"+maxSpeed);
		System.out.println("Bus Started");
	}
}
