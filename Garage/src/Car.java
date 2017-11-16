
public class Car extends Vehicle {

	public Car(int vehicleID, String vehicleColour) {
		this.vehicleType = "Car";
		this.vehicleID = vehicleID;
		this.vehicleColour = vehicleColour;
	}

	@Override
	public int getNumOfWheels() {
		return 4;
	}

	public float getWheelCost() {
		float wheelCost = (float) ((float) getNumOfWheels() * 3.3);
		return wheelCost;
	}

	@Override
	public int getNumOfSeats() {
		return 5;
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
