package ps;

public class DemoBean {

	private String name;
	private String message;

	public DemoBean(String name, String message) {
		this.name=name;
		this.message=message;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(message);
	}
}
