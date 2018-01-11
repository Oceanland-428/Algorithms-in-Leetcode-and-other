public class Solution {
	Random rand = new Random();

	public int[] quickSort(int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		quickSortHelper(array, 0, array.length-1);
		return array;
	}

	private void quickSortHelper(int[] array, int left, int right) {
		if (left >= right) return;
		int pivotPos = partition(array, left, right);

		quickSortHelper(array, left, pivotPos - 1);
		quickSortHelper(array, pivotPos + 1, right);
	}

	private int partition(int[] array, int left, int right) {
		int pivotIndex = left + rand.nextInt(right - left + 1);

		int pivot = array[pivotIndex];
		swap(array, pivotIndex, right);

		int i = left;
		int j = right - 1;

		while (i <= j) {
			if (array[i] < pivot) i++;
			else if (array[j] >= pivot) j--;
			else {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		swap(array, i, right);
		return i;
	}

	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
