
public class Conditionals {

	public static void main(String[] args) {
		
		System.out.println(sumOf(7, 13, false));
	}
	
	public static int sumOf(int i, int j, boolean isTrue) {
		if (isTrue) return i + j;
		else return i * j;
	}

}
