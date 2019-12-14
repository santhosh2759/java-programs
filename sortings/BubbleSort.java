package sortings;



public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {4,3,2,10,12,1,5,6};
		//int[] a = {1,2,3,4,5};
		sortArray(a);
		printArray(a);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void sortArray(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			boolean swapped = false;
			for (int j = 0; j < len - i - 1; j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
					swapped = true;
				}
			}
			//if array is already sorted no need to proceed further
			if(swapped == false) {
				return;
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
