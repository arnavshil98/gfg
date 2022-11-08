package shiva;

public class BubbleShort {
/*
 * best case O(n), worst case O(N^2)
 * STABLE AS IT DOESN'T SWAP, equal and elements if sorted
 * interview point, important.
 */
	public void indexBubble(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int largerElement = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = largerElement;
					swap = true;
				}

			}
			if (!swap) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		BubbleShort obj = new BubbleShort();
		int[] arr = { 56, 433, 22, 0, 8, 8 };
		obj.indexBubble(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
