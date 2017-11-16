import java.util.ArrayList;

public class Task2 {
	static ArrayList<Integer> placements = new ArrayList<>();

	public static void main(String[] args) {

		for (int i = 1; i <= 300; i++) {
			placements.add(i);
		}

		Task2 a = new Task2();
		a.overallPlacement(4);
		
	}
		public static void overallPlacement(int dogPlacement) {
			for (int i = 1; i <= placements.size() + 1; i++) {
				if(i == dogPlacement) {placements.remove(dogPlacement);}
				else {
				String position = Integer.toString(i);
				
				if (position.endsWith("11") || position.endsWith("12") || position.endsWith("13")) System.out.print(position + "th " );
				else if (position.endsWith("1")) System.out.print(position + "st ");
				else if (position.endsWith("2")) System.out.print(position + "nd ");
				else if (position.endsWith("3")) System.out.print(position + "rd ");
				else System.out.print(position + "th ");
			}
		}
	}
}