import java.util.Scanner;

public class PaintWizard {

	public static void main(String[] args) {
		
		int roomSizeToPaint = 0;
		String cheapestPaint;
		String leastCans;
		
		CheapoMax cM = new CheapoMax(roomSizeToPaint);
		
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Please Enter Size of Room in METERS SQUARED: ");
		roomSizeToPaint = scanner.nextInt();

		System.out.println(cM.numberOfTinsNeeded(roomSizeToPaint));
		System.out.println(cM.totalPaintCost());
	}

}
