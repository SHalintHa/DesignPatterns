package prototype;

public abstract class Shape implements Cloneable {
	private int id;
//	protected String type;
	
	abstract void draw();
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
