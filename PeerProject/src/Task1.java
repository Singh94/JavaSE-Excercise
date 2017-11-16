
public class Task1 {

	public static void main(String[] args) {

		System.out.println(recursive(120));
	}

	public static String recursive(int factorial) {
		int currentDivisor = 1;
		int result = 0;

		do {
			factorial /= currentDivisor;
			++currentDivisor;
		} while (factorial > currentDivisor);

		if (currentDivisor == factorial)
			result = currentDivisor;
		return result + "!";
		
	}
}