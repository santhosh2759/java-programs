package sortings;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {6,4,8,2};
		//mergeSort(a);
		mergeSortwithSystemArrayCopy(a);
		print(a);
	}

	private static void mergeSortwithSystemArrayCopy(int[] a) {
		if (a.length <= 1)
			return;
		int[] L = new int[a.length / 2];
		int[] R = new int[a.length - L.length];

		// copy values to temp arrays
		System.arraycopy(a, 0, L, 0, L.length);
		System.arraycopy(a, L.length, R, 0, R.length);
		mergeSortwithSystemArrayCopy(L);
		mergeSortwithSystemArrayCopy(R);
		mergeWithSystemArrayCopy(a, L, R);
	}

	private static void mergeWithSystemArrayCopy(int[] a, int[] l, int[] r) {
		int i = 0, j = 0, k = 0;
		while(i<l.length&&j<r.length) {
			if(l[i] < r[j]) {
				a[k] = l[i];
				i++;
			}else {
				a[k] = r[j];
				j++;
			}
			k++;
		}
		System.arraycopy(l, i, a, k, l.length-i);
		System.arraycopy(r, j, a, k, r.length-j);
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
			mergeWithSystemArrayCopy(a, l, m, r);
			merge(a, l, m, r);
		}
	}
	
	private static void mergeWithSystemArrayCopy(int[] a, int l, int m, int r) {
		//temp array size
		int len1 = m - l + 1;
		int len2 = r - m;
		//temp arrays
		int[] L = new int[len1];
		int[] R = new int[len2];
		
		//copy values to temp arrays
		System.arraycopy(a, l, L, 0, len1);
		System.arraycopy(a, m+1, R, 0, len2);
		
		//copy values to the original array
		int i = 0, j = 0, k = l;
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
		
		//copy remaining values to the original array
		System.arraycopy(L, i, a, k, len1-i);
		System.arraycopy(R, j, a, k, len2-j);
	}

	private static void merge(int[] a, int l, int m, int r) {
		//temp array size
		int len1 = m - l + 1;
		int len2 = r - m;
		//temp arrays
		int[] L = new int[len1];
		int[] R = new int[len2];
		
		//copy values to temp arrays
		for (int i = 0; i < len1; i++)
			L[i] = a[l + i];
		for (int j = 0; j < len2; j++)
			R[j] = a[m + 1 + j];
		
		//copy values to the original array
		int i = 0, j = 0, k = l;
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
		//copy remaining values to the original array
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
