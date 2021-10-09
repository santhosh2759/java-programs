package practice;

public class SwitchTest {

	public static void main(String[] args) {
		print('1');
	}

	private static void print(char c) {
		switch(c) {
		case '1':
			System.out.println("Char is: 1");
		case '2':
			System.out.println("Char is: 2");
			break;
		default:
			System.out.println("Char is: 3");
		}
	}

}
