package prototype;

public class Circle extends Shape{
	
	private String type;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		this.type = "Circle";
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle draw() method");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
