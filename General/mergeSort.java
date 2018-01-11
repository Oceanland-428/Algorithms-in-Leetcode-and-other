public class Solution {
	public int[] mergeSort(int[] array) {
		if (array == null || array.length == 0) return array;
		int[] helpArr = new int[array.length];
		mergeSortHelper(array, 0, array.length-1, helpArr);
		return array;
	}

	private void mergeSortHelper(int[] array, int left, int right, int[] helpArr) {
		if (left >= right) return;

		int mid = left + (right - left) / 2;
		mergeSortHelper(array, left, mid, helpArr);
		mergeSortHelper(array, mid + 1, right, helpArr);

		for (int i = left; i <= right; i++) {
			helpArr[i] = array[i];
		}
		int l = left;
		int k = left;
		int r = mid + 1;
		while (l <= mid && r <= right) {
			if (helpArr[l] < helpArr[r]) {
				array[k] = helpArr[l];
				l++;
			} else {
				array[k] = helpArr[r];
				r++;
			}
			k++;
		}
		while (l <= mid) {
			array[k] = helpArr[l];
			l++;
			k++;
		}
	}
}
