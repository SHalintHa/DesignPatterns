
public class Application {

	public static void main(String[] args) {
		VehicleTypes vehicleType1 = VehicleFactory.createVehicleType(VehicleCode.LIGHT);
		System.out.println(vehicleType1);
		
		VehicleTypes vehicleType2 = VehicleFactory.createVehicleType(VehicleCode.MIDDLE);
		System.out.println(vehicleType2);
	}
}
