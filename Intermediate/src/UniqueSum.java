public class UniqueSum {

	public static void main(String[] args) {
		
		System.out.println(uniqueSum(1, 2, 3));
		System.out.println(uniqueSum(3, 3, 3));
		System.out.println(uniqueSum(1, 1, 3));

	}
	
	public static int uniqueSum(int x, int y, int z) {
		if(x == y && y == z) return 0;
		else if (x == y) return y + z;
		else if (y == z) return x + y;
		else if (x == z) return x + y;
		else return x + y + z;
	}

}
