package ps;

public class DemoBean {

	private String user;
	private int id;
	
	public DemoBean(String user,int id) {
		this.user=user;
		this.id=id;
	}
	
	public DemoBean(int id,String user) {
		this.user=user;
		this.id=id;
	}
	
	public void show() {
		System.out.println(id);
		System.out.println(user);
	}
	
}
