// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class Task8 {

	public static void main(String[] args) {
		System.out.println(bunnyEars(0));
		System.out.println(bunnyEars(1));
		System.out.println(bunnyEars(2));
	}
	
	public static int bunnyEars(int numOfBunnies) {
		if (numOfBunnies == 0) return 0;
		return 2 + bunnyEars(numOfBunnies - 1);
	}

}
