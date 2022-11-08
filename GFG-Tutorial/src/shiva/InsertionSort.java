package shiva;

public class InsertionSort {

	public void sortArr(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				// shift j th element to j+1 position
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key; 
			/*
			 because all greater elements are shifted right
			 now we will, have an empty space when we compare j th element to key.
			 hence shift key to j+1 position as it is empty.
			 */
		}
	}

	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int [] arr = {5,2,8,9,5,6};
		obj.sortArr(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
