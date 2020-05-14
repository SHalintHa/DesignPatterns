package prototype;

public class Rectangle extends Shape {
	
	private String type;
	public Rectangle() {
	type = "Rectangle";
	}
	
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle draw() method");
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
