package in.co.basics.RemoteSystemsTempFiles;

public class EvenNo {
public static void main(String[] args) {
	int count=0;
	int no=0;
	String evenNumbers="";

	for (int i=1;i<=10;i++){
		if(i % 2 ==0) {
			evenNumbers += i + " ";
			count=count+i;
			no++;
		}
		
	}System.out.println("the sum of all Even no = "+count);
		System.out.println("Even no Present ="+no);
        System.out.println(evenNumbers);
}}
