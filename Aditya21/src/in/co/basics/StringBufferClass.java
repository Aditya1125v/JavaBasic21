package in.co.basics;

import java.net.Socket;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vijay ");
		sb.append("Dinanath Chauhan");
		System.out.println("Length :" + sb.length());// (Shortcut for comment "ctrl+shift+/")not follow indexing

		System.out.println("sb :" + sb);/// (Shortcut for uncomment "ctrl+shift+\")why space not come in concatinaton
		System.out.println("Capacity :" + sb.capacity());// same as length
		System.out.println("Char at :" + sb.charAt(1));
		System.out.println("Index Of :" + sb.indexOf("Dinanath"));
		System.out.println("Replace ;" + sb.replace(1, 10, "RAJA"));// Replace all 1 to
		System.out.println("Reverse ;" + sb.reverse());

	}

}
