package in.co.OOP;

public class ConstructorLoverloading {
public ConstructorLoverloading () {
	System.out.println("i'm default Constructor");
}
public ConstructorLoverloading(int a){
	this();
	System.out.println("i'm parameter Constructor");
}

public ConstructorLoverloading(int a,int b){
	this(a);
	System.out.println("i'm second parameter Constructor");
}
public ConstructorLoverloading(int a,int b,int c){
	this(a,b);
	System.out.println("i'm third parameter Constructor");
}public static void main(String[] args) {
	ConstructorLoverloading c=new ConstructorLoverloading(10,20,30);
	
	
}	
}

