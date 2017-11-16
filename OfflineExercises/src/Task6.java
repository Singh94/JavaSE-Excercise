// Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. 
// So "yyzzza" yields "yza".

public class Task6 {

	public static void main(String[] args) {
		System.out.println(stringClean("yyzzza"));
		System.out.println(stringClean("abbbcdd"));
		System.out.println(stringClean("Hello"));
	}
	
	public static String stringClean(String clean) {
		String x = "";
		
		for(int i = 0; i < clean.length() -1; i++) {
			if (clean.charAt(i) != clean.charAt(i + 1) && i != clean.length()) {
				x += clean.charAt(i);
			}
		}
		x += clean.charAt(clean.length()-1);
		return x;
	}

}

//TODO