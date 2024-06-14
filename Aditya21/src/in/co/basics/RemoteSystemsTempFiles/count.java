package in.co.basics.RemoteSystemsTempFiles;

public class count {
	public static void main(String[] args) {
		String []s= {"aditya","megha","raman","himanshi"};
		int counts=0;
		for(String S1:s) {
		String S3= S1.toLowerCase();
				
		for(char a='a';a<='z';a++) {
			for(int i=0;i<S3.length();i++) {
				if(a == S3.charAt(i)) {
					counts++;}
				if(counts!=0) {
					System.out.println(a+" = "+counts);
					counts=0;}
				   }
			}
		}
		}
	}
			


