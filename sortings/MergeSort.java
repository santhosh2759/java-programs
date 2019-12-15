package sortings;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {6,4,8,2};
		mergeSort(a);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void mergeSort(int[] a) {
		mergeSort(a,0,a.length-1);
	}

	private static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	private static void merge(int[] a, int l, int m, int r) {
		//temp array size
		int len1 = m - l + 1;
		int len2 = r - m;
		//temp arrays
		int[] L = new int[len1];
		int[] R = new int[len2];
		int i = 0, j = 0, k = l;
		//copy values temp arrays
		for (i = 0; i < len1; i++)
			L[i] = a[l + i];
		for (j = 0; j < len2; j++)
			R[j] = a[m + 1 + j];
		i = 0;
		j = 0;
		//copy values to the original array
		while (i < len1 && j < len2) {
			if (L[i] < R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		//copy remining values to the original array
		while (i < len1) {
			a[k] = L[i];
			i++;
			k++;
		}
		while (j < len2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}

}
