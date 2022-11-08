package shiva;

public class BinarySearchIterative {

	public int index(int[] arr, int x) {

		int low = 0;
		int high = arr.length - 1;
		int i = 1;
		while (low <= high) {
			System.out.println("execution number"+i);
			System.out.println("low: "+ low);
			System.out.println("high: "+ high);
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchIterative obj = new BinarySearchIterative();
		int[] arr = {5,6,77,88,99};
		System.out.println(obj.index(arr, 88));
	}

}
