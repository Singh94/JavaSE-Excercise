
public class Bus extends Vehicle {

	public Bus(int vehicleID, String vehicleColour) {
		this.vehicleType = "Bus";
		this.vehicleID = vehicleID;
		this.vehicleColour = vehicleColour;
	}

	@Override
	public int getNumOfWheels() {
		return 6;
	}

	public float getWheelCost() {
		float wheelCost = (float) ((float) getNumOfWheels() * 3.3);
		return wheelCost;
	}

	@Override
	public int getNumOfSeats() {
		return 72;
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
