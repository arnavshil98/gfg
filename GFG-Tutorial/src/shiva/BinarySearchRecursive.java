package shiva;

public class BinarySearchRecursive {

	public int search(int[] arr, int begin, int end, int x, int i) {

		System.out.println("execution number" + i);
		int mid = (begin + end) / 2;
		if (arr[mid] == x) {
			return mid;
		}
		if (arr[mid] > x) {
			i = i + 1;
			return search(arr, begin, mid - 1, x, i);
		} else if (arr[mid] < x) {
			i = i + 1;
			return search(arr, mid + 1, end, x, i);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		BinarySearchRecursive obj = new BinarySearchRecursive();
		int[] arr = { 1, 3, 5, 9, 11, 14 };
		System.out.println(obj.search(arr, 0, 5, 11, 0));
	}

}
