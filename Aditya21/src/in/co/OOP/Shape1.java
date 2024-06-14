package in.co.OOP;

public class Shape1 {
   public Shape1() {
	
}
   public double area() {
	   return 0;
}
   public static Shape1 getshape(int i) {
	   if (i==1) {
//		   System.out.println("Area of Rectangle");
		   return new Rectangle1(5,6);
	   }
	if(i==2) {
//		 System.out.println("Area of Circle");
		return new Circle1(4);
	}
	if(i==3) {
//		 System.out.println("Area of Triangle");
		return new Triangle1(20,40);
	}
	   return new Shape1();
   }
}