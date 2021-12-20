package OOP;

public class Armor {
	private String name;
	private int height;
	
	public Armor() {
		name = "mark0";
		height = 200;
	}
	
	public Armor(String name, int height) {
		this.name = name;
		this.height = height; 
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
