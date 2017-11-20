
public class CheapoMax extends Paints {
	
	private float paintTinCost = (float)19.99;
	private int totalTinCoverage = 10;
	private int numberOfTinsNeeded;
	private int roomSizeToPaint;
	private float totalPaintCost;
	
	public CheapoMax(int numberOfTinsNeeded) {
		this.numberOfTinsNeeded = numberOfTinsNeeded;
	}
	
	public int numberOfTinsNeeded(int roomSizeToPaint) {
		numberOfTinsNeeded = roomSizeToPaint / totalTinCoverage;
		return numberOfTinsNeeded;
	}
	
	public float totalPaintCost() {
		totalPaintCost = paintTinCost * numberOfTinsNeeded(roomSizeToPaint);
		return totalPaintCost;
	}
	
}
