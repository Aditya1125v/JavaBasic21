package in.co.basics;

public class StringMultipleTask {
	public static void main(String[] args) {
		String Name = "Vijay Dinanath Chauhan";
		System.out.println("String Length = " + Name.length());
		System.out.println("7th Character is = " + Name.charAt(6));
		System.out.println("Dina index is = " + Name.indexOf("Dina"));// if not find in string then it show -1
		System.out.println("First i Position = " + Name.indexOf("y"));// show index of 'i'
		System.out.println("Last i Position = " + Name.lastIndexOf("i"));// show index of 'i'
		System.out.println("A is replaced by b-" + Name.replace("a", "x"));// Replace all "a" to "x"
		System.out.println("Chhota Vijay = " + Name.toLowerCase());
		System.out.println("Bada Vijay = " + Name.toUpperCase());
		System.out.println("Start With Vijay = " + Name.startsWith("Vijay"));// show true or false
		System.out.println("Ends with uha= " + Name.endsWith("uhan"));// show index no of 'u'
		System.out.println("Substring = " + Name.substring(6));// show form index 6 "Dinanath Chauhan"

	}
}
