
public class Arrays {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		
		for(int x = 0; x < 10; x++) {
			intArray[x] = x+3;
		}
		
		System.out.println(sumOf(intArray[3], intArray[7], true));
		System.out.println(sumOf(intArray[5], intArray[9], false));
	}
	
	public static int sumOf(int i, int j, boolean isTrue) {
		if(i == 0) return j;
		else if (j == 0) return i;
		else if (isTrue) return i + j;
		else return i * j;
	}

}
