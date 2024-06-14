package in.co.basics;

public class ReverseNameWithString2 {
	public static void main(String[] args) {
		String name = "Swati Laxmi";
		for (int i = name.length() - 1; i >= 0; i--) {//
			System.out.print(name.charAt(i));
		}
	}
}
