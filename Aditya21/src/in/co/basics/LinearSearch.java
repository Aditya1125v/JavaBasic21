package in.co.basics;

public class LinearSearch {
	public static void main(String[] args) {
		int[] Num = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int Key = 4;
		int index = search(Num, Key);
		if (index == -1) {
			System.out.println("key not found " + Key);
		} else {
			System.out.println("key is at index " + index);
		} // index ke jagah per key or try karo
	}

	public static int search(int Num[], int Key) {
		for (int i = 0; i <= Num.length; i++) {
			if (Num[i] == Key) {
				return i;
			}
		}
		return -1;
	}
}
