
public class IterationArrays {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		
		for(int x = 0; x < 10; x++) {
			intArray[x] = x+3;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(intArray[i]);
		}
	}
}
