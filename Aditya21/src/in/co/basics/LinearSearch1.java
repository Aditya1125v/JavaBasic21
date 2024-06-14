package in.co.basics;

public class LinearSearch1 {
	public static void main(String[] args) {
		String[] Num = { "Apple", "Mango", "Kiwi", "Banana" };
		String Key = "Banana";
		int index = search(Num, Key);
		if (index == -1) {
			System.out.println("key not found " + Key);
		} else {
			System.out.println("key is at index " + index);
		} // index ke jagah per key or try karo
	}

	public static int search(String Num[], String Key) {
		for (int i = 0; i <= Num.length; i++) {
			if (Num[i] == Key) {
				return i;
			}
		}
		return -1;
	}
}
