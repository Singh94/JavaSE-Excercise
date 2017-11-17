// Output a diamond in characters to the console window with loops that construct it

public class Task9 {

	public static void main(String[] args) {
		printDiamond(10);
	}
	
	public static void printDiamond(int size) {
		for (int i = 1; i <= size; i += 2) {
			for (int j = size; j >= i; j -= 2) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }
		
		for (int i = 1; i <= size; i += 2) {
			for (int k = 1; k <= i; k += 2) System.out.print(" ");
            for (int j = size-1; j >= i; j--) System.out.print("*");
            System.out.println();
        }
	}
}
