import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public static void main(String[] args) {
		Garage myGarage = new Garage();
		
		myGarage.addVehicle(10001, "Car", "Blue");
		myGarage.addVehicle(10002, "Car", "Black");
		myGarage.addVehicle(20001, "Bus", "Red");
		myGarage.addVehicle(20002, "Bus", "White");
		myGarage.addVehicle(30001, "Moterbike", "Green");
		myGarage.addVehicle(30002, "Moterbike", "Red");
		
		System.out.println("Showing Garage");
		System.out.println(myGarage.showGarage());
		
		System.out.println("Adding new Vehicle to Garage");
		myGarage.addVehicle(30004, "Moterbike", "Black");
		System.out.println(myGarage.showGarage());
		
		System.out.println("Adding new Invalid Vehicle to Garage - Details Below");
		System.out.println("40001, Quadbike, Black");
		myGarage.addVehicle(40001, "Quadbike", "Black");
		System.out.println(myGarage.showGarage());
		
		System.out.println("Removing Vehicle With ID '20002'");
		myGarage.removeVehicle(20002);
		System.out.println(myGarage.showGarage());	
	}

	public void removeVehicle(int vehicleID) {
		if(!vehicleList.removeIf(s -> s.vehicleID == vehicleID))
		System.out.println("VehicleID: " + vehicleID + " was not found");
	}
	
	public void emptyGarage() {
		ArrayList<Vehicle> emptyGarage = new ArrayList<Vehicle>();
		vehicleList = emptyGarage;
	}

	public void addVehicle(int vehicleID, String vehicleType, String vehicleColour) {
		switch(vehicleType) {
			case "Car" :
				Car c = new Car(vehicleID, vehicleColour);
				vehicleList.add(c); break;
			case "Bus" :
				Bus b = new Bus(vehicleID, vehicleColour);
				vehicleList.add(b); break;
			case "Moterbike" :
				Moterbike m = new Moterbike(vehicleID, vehicleColour);
				vehicleList.add(m); break;
			default :
				System.err.println(vehicleType + " Is not a valid vehicle type");
		}
	}
	
	public String showGarage() {
		String allVehicles = "";
		if(vehicleList.isEmpty()) return "Garage is Empty";
		else {
			for(Vehicle vehicle : vehicleList) {
				allVehicles += vehicle.toString() + " Bill: £" + vehicle.getBill() + "\n";
			}
			return allVehicles;
		}
	}
}

