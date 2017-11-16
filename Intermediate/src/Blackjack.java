
public class Blackjack {

	public static void main(String[] args) {			
			System.out.println(blackjack(18, 21));
			System.out.println(blackjack(20, 18));
			System.out.println(blackjack(22, 22));
	}
	
	public static int blackjack(int i, int j) {
		if(i <= 21 && j <= 21) {
			if (i < j) return j;
			else return i;
		}
		else return 0;
	}
}