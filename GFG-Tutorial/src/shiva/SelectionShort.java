package shiva;

public class SelectionShort {

	public void indexSelect(int[] arr) {
		int s = 0;
		for (int index = 0; index < arr.length - 1; index++) {

			for (int i = index + 1; i < arr.length; i++) {
				if (arr[index] > arr[i]) {
					index = i;
				}

			}
			arr[s] = arr[index];
			s++;
		}
	}

	public static void main(String[] args) {
		SelectionShort obj = new SelectionShort();
		int[] arr = { 12, 4, 8, 3, 11 };
		obj.indexSelect(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
