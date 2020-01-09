package miscellaneous;

public class ArrayReverseWithoutExtraSpce {

	public static void main(String[] args) {
		int[] a = {1,3,4,2,5};
		reverse(a);
		print(a);
	}

	private static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void reverse(int[] a) {
		int len = a.length;
		for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
			swap(a, i, j);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
