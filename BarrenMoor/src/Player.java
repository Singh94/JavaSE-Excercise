
public class Player {

	GameManager gameManager = new GameManager();
	
	int xPos;
	int yPos;
	
	public Player(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	public void setPlayerLocation(Player p, int xPos, int yPos) {
		gameManager.gameMap[xPos][yPos] = 1;		
	}

}
