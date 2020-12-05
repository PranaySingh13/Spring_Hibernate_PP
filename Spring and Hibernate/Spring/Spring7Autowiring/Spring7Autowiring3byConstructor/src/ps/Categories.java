package ps;

public class Categories {

	private String name;
	private Book b;
	
	public Categories(Book b) {
		this.b = b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	
	public void show() {
		System.out.println("Categories Name: "+name);
		System.out.println("Book Name: "+b.getBookname()+" and Book Price: "+b.getBookprice());	
	}
}
