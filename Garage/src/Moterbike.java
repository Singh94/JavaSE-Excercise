
public class Moterbike extends Vehicle {
	
	public Moterbike(int vehicleID, String vehicleColour) {
		this.vehicleType = "Moterbike";
		this.vehicleID = vehicleID;
		this.vehicleColour = vehicleColour;
	}
	
	@Override
	public int getNumOfWheels() {
		return 2;
	}
	
	public float getWheelCost() {
		float wheelCost = (float) ((float) getNumOfWheels() * 3.3);
		return wheelCost;
	}
	
	@Override
	public int getNumOfSeats() {
		return 1;
	}
	
	public float getSeatCost() {
		float seatCost = (float) ((float) getNumOfSeats() * 7.7);
		return seatCost;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID: " + vehicleID + ", Vehicle Type: " + vehicleType + ", Vehicle Colour: " + vehicleColour;
	}
	
}
