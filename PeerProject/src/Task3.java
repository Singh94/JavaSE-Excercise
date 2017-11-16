public class Task3 {
	
	static String[] sentenceArray;
	
	public static void main(String[] args) {
		
		String sentence = "Deep episodes of Deep Space Nine came on the television only after the news. Digital alarm clocks scare area children.";
		sentenceArray = sentence.split(" ");
		String concatString = "";
		
		for(int i = 0; i < sentenceArray.length - 1; i++) {
			for(int j = 1; j < sentenceArray.length; j++) {
				String x = sentenceArray[i].substring(sentenceArray[i].length() - 2);
				String y = sentenceArray[j].substring(0, 2);
				
				if(x.equals(y)) {
					concatString += sentenceArray[i];
					concatString += sentenceArray[j].substring(2);
					j++;
					i++;
				}
				else {
					concatString += sentenceArray[i];
				}
					concatString += " ";
					i++;
			}
			concatString += sentenceArray[i];
			System.out.println(concatString);
		}		
	}
}
