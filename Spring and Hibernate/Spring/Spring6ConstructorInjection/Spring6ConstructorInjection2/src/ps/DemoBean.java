package ps;

public class DemoBean {

	private int id;
	private String message;

	public DemoBean(int id, String message) {
		this.id=id;
		this.message=message;
	}
	
	public void show() {
		System.out.println(id);
		System.out.println(message);
	}
}
