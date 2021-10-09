package practice;

public class Main {
	
	public static void main(String[] args) {
		String input = "11A2B3C";
		for(int i=0; i<input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i)))
				System.out.print(input.charAt(i));
		}
		String string = String.join("-", "JAVA", "IS", "COOL");
		System.out.println(string);
	}
}
