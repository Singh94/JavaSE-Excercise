
public class Treasure {

	GameManager gameManager = new GameManager();
	
	int xPos;
	int yPos;
	
	public Treasure(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	public void setTreasureLocation(Treasure t, int xPos, int yPos) {
		gameManager.gameMap[xPos][yPos] = 2;		
	}

}
