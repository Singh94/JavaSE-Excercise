public abstract class Vehicle {
	
	String vehicleType;
	int vehicleID;
	String vehicleColour;
	
	public String vehicleType() {
		return this.vehicleType;
	}

	public int vehicleID() {
		return this.vehicleID;
	}
	
	public String vehicleColour() {
		return this.vehicleColour;
	}

	public float getBill() {
		float totalBill = getWheelCost() + getSeatCost();
		return totalBill;
	}
	
	public abstract int getNumOfWheels();
	public abstract int getNumOfSeats();
	public abstract float getWheelCost();
	public abstract float getSeatCost();

	@Override
	public String toString() {
		return "Vehicle Type: " + vehicleType + ", Vehicle ID: " + vehicleID + ", Vehicle Colour=" + vehicleColour;
	}
	

}

