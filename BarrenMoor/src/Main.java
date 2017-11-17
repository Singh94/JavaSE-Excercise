import java.util.Scanner;

public class Main {
	
	GameManager gameManager = new GameManager();

	public static void main(String[] args) {
		
		Main m = new Main();
		Player p = new Player(0, 0);
		
		
		//Print Grid
		m.printMap();
		
		int xPos = 0;
		int yPos = 0;
		String direction;
		int spaces = 0;
			
		//Player Loc
		p.setPlayerLocation(p, xPos, yPos);
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("To Quit enter 'Q'!");
		
		System.out.println("Please Enter Direction, Followed by Number of Spaces\n");
		System.out.println("Example, N");
		System.out.println("Example, 5\nGo North 5 Spaces");
		System.out.println("N = North");
		System.out.println("E = East");
		System.out.println("S = South");
		System.out.println("W = West");
		
		do {					
			System.out.println("Please Enter Direction: ");
			direction = sc.next();
			direction = direction.toLowerCase();
			if(direction.equals("q")) {
				System.out.println("Game Exited");
				break;
			}
			
			System.out.println("Please Enter Number of Spaces: ");
			spaces = sc.nextInt();
			
			if (direction.equals("n")) {
				p.setPlayerLocation(p, xPos, yPos + spaces);
				System.out.println("You have moved North by " + spaces);
			}
			
			if (direction.equals("s")) {
				if(yPos == 0) {
					if(xPos == 0) System.out.println("You are at a brick wall");
				}
				else {
					p.setPlayerLocation(p, xPos, yPos - spaces);
					System.out.println("You have moved South by " + spaces);
				}
			}
			
			if (direction.equals("e")) {
				p.setPlayerLocation(p, xPos + spaces, yPos);
				System.out.println("You have moved East by " + spaces);
			}
			
			if (direction.equals("w")) {
				if(xPos == 0) System.out.println("You are at a brick wall");
				else {
					p.setPlayerLocation(p, xPos - spaces, yPos);
					System.out.println("You have moved West by " + spaces);
				}

			}	
		}while(!direction.equals("q"));
		
		
		sc.close();
	}
	
	private void printMap() {
		for(int i = 0; i < gameManager.gameMap.length; i++) {
			for(int j = 0; j < gameManager.gameMap[i].length; j++) {
				System.out.print(gameManager.gameMap[i][j]);
			}
			System.out.println();
		}
	}
	
		
}
