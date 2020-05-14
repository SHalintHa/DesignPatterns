import java.util.ArrayList;
import java.util.List;

public abstract class VehicleTypes {
	
	protected  List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public VehicleTypes() {
		createVehicleType();
	}

	protected abstract void createVehicleType();
	
	public String toString() {
		return "Package{" + "Vehicle Type : " + vehicles + " }";
	}

}
