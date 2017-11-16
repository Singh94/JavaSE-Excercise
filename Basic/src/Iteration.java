
public class Iteration {

	public static void main(String[] args) {
		
		for(int x = 0; x < 10; x++) {
			System.out.println("-- Output " + x + " --");
			System.out.println(sumOf(7, 13, false));
			System.out.println(sumOf(7, 0, true));
		}
	}
	
	public static int sumOf(int i, int j, boolean isTrue) {
			if(i == 0) return j;
			else if (j == 0) return i;
			else if (isTrue) return i + j;
			else return i * j;
		}
}