package shiva;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

	public void conquer(int[] arr, int low, int mid, int high) {
		int[] merger = new int[high - low + 1];
		int i = 0;
		int leftIndex = low;
		int rightIndex = mid + 1;
		while (leftIndex <= mid && rightIndex <= high) {
			if (arr[leftIndex] <= arr[rightIndex]) {
				merger[i] = arr[leftIndex];
				i++;
				leftIndex++;
			} else {
				merger[i] = arr[rightIndex];
				i++;
				rightIndex++;
			}
		}
		while (leftIndex <= mid) {
			merger[i] = arr[leftIndex];
			i++;
			leftIndex++;
		}
		while (rightIndex <= high) {
			merger[i] = arr[rightIndex];
			i++;
			rightIndex++;
		}

		for (int x = 0,p=low; x < merger.length; x++,p++) {
			arr[p] = merger[x];
		}
	}

	public void divide(int arr[], int low, int high) {
		if (low >= high)
			return;
		int mid = low + (high - low) / 2;
		divide(arr, low, mid);
		divide(arr, mid + 1, high);
		conquer(arr, low, mid, high);
	}

	public void mergeSorting(int[] arr) {
		divide(arr, 0, arr.length-1);
	}

	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		int[] arr = { 4, 1, 8, 12, 6, 8 };
		obj.mergeSorting(arr); // stable sorting
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
