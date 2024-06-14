package in.co.OOP;

public class MethodOverLoading {
 public void raman() {
	 System.out.println("helloWorld");
	 
 }
 public void raman(int a){
	 System.out.println(a);
 }
 public void raman (int a, int b) {
	 int c = a+b;
	 System.out.println(c);
 }
 public void raman(int a,int b, int c ) {
	 System.out.println("Sum : "+a+b+c);/// why arthmathic is not work properly
 }public static void main(String[] args) {
MethodOverLoading m=new MethodOverLoading();
m.raman(10);
m.raman(10, 20);
m.raman(10,20,30);
}
}
