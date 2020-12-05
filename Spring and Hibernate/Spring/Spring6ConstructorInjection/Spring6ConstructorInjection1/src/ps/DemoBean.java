package ps;

public class DemoBean {

	private String message;
	
	//Setter 
	public void setMessage(String message) {
		this.message = message;
	}

	//Constructor
	public DemoBean(String message) {
		this.message=message;
	}
	// note: setter will overides contructor.
	
	public void show() {
		System.out.println(message);
	}
}
