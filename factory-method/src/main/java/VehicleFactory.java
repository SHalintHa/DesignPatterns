
public class VehicleFactory {
	
	public static VehicleTypes createVehicleType(VehicleCode vehicleCode ) {
		
		switch (vehicleCode) {
		case LIGHT:
			return new LightVehicles();
		case MIDDLE:
			return new MiddleVehicles();
		case HAVY:
			return new HavyVehicles();

		default:
			return null;
		}
	}

}
