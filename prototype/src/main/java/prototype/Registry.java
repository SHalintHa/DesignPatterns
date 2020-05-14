package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<ShapeType, Shape> shapes = new HashMap<>();
	
	
	public Registry() {
		// TODO Auto-generated constructor stub
		this.initialize();
	}


	private void initialize() {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		circle.setId(1);
		circle.setType("Circle");
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId(2);
		rectangle.setType("Rectangle");
	
		shapes.put(ShapeType.CIRCLE, circle);
		shapes.put(ShapeType.REACTANGLE, rectangle);
		
	}
	
	public Shape getShape(ShapeType shapeType) {
		
		Shape shape = null;
		try {
			shape = (Shape) shapes.get(shapeType).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shape;
	}

}
