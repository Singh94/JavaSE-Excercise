import java.util.Arrays;
import java.util.Random;

public class GameManager {
	
	private int xGrid = 10;
	private int yGrid = 10;

	// 1 = player
	// 2 = treasure
	
	int[][] gameMap = new int[xGrid][yGrid];

	
	public void getTreasureLocation() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(gameMap[i][j] == 3) {
					System.out.println(i + ", " + j); 
					break;
				}
			}
		}
	}
	
	
	public void setRPLocation(Player p) {
		Random r = new Random();
		int lower = r.nextInt(xGrid - yGrid);
		int upper = r.nextInt(xGrid - yGrid);
		
		p.setPlayerLocation(p, lower, upper);
	}
	
	public void setTreasureLocation(Treasure t) {
		Random r = new Random();
		int lower = r.nextInt(xGrid - yGrid);
		int upper = r.nextInt(xGrid - yGrid);
		
		t.setTreasureLocation(t, lower, upper);
	}
		
}

