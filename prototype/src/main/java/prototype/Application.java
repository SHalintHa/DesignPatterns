package prototype;

public class Application {
	
	public static void main(String[] args) {
		
		Registry registry = new Registry();
		
		Circle circle = (Circle) registry.getShape(ShapeType.CIRCLE);
		System.out.println(circle.getType());
		
		circle.setType("Oval");
		
		System.out.println(circle.getType());
		
		Circle circle1 = (Circle) registry.getShape(ShapeType.CIRCLE);
		System.out.println(circle1.getType());
		
	}

}
