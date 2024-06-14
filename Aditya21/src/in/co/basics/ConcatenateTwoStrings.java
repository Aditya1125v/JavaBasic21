package in.co.basics;

public class ConcatenateTwoStrings {
	public static void concatination() {
		String A = "leonardo";
		System.out.println(A + " The Vinci");
	}

	public static void main(String[] args) {
		concatination();
		TwoStringsApeend();
	}

	public static void TwoStringsApeend() {
		StringBuffer A = new StringBuffer("Ramsingh ");
		A.append("Verma JI");
		System.out.println("What is your Name : " + A);
	}
}