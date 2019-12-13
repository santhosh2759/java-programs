package sortings;

public class ArraySort {

	public static void main(String[] args) {
		int[] a = {4,3,2,10,12,1,5,6};
		sortArray(a);
		printArray(a);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void sortArray(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if(a[j] < a[j-1]) {
					swap(a,j,j-1);
				}
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
