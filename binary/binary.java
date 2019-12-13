package binary;

public class binary {

	public static void main(String[] args) {
		int i = 5;
		toBinayString(i);
	}

	private static String toBinayString(int num) {
		int rem = 0;
		String bin = "";
		while(num > 0) {
			rem = num % 2;
			num = num / 2;
			bin = rem + bin;
		}
		System.out.println(bin);
		return bin;
	}

}
