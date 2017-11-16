public class TooHot {

	public static void main(String[] args) {
		
		boolean isSummer = true;
		int tempLowerBound = 60;
		int tempUpperBound = 90;
		
		if(isSummer) tempUpperBound = 100;
		
		System.out.println(inRange(isSummer, 66, tempLowerBound, tempUpperBound));
		System.out.println(inRange(isSummer, 30, tempLowerBound, tempUpperBound));
	}

	public static boolean inRange(boolean isSummer, int currentTemp, int tempLower, int tempUpper) {
		if(isSummer && currentTemp >= tempLower && currentTemp <= tempUpper) return true;
		else return false;
	}
	
}
