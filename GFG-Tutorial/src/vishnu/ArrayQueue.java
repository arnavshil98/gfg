package vishnu;

/*
 * implementation of array in queue
 */
public class ArrayQueue {
	int[] arr;
	int index;
	int size;

	public ArrayQueue(int x) {
		size = x;
		arr = new int[x];
		index = -1;
	}

	public void enqueue(int a) {
		if (isFull())
			return;
	
	}

	public Boolean isFull() {
		if (index == size) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
