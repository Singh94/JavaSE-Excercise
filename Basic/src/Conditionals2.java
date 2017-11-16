
public class Conditionals2 {

	public static void main(String[] args) {
		
		System.out.println(sumOf(7, 13, false));
		System.out.println(sumOf(7, 0, true));
	}
	
	public static int sumOf(int i, int j, boolean isTrue) {
		if(i == 0) return j;
		else if (j == 0) return i;
		else if (isTrue) return i + j;
		else return i * j;
	}

}
