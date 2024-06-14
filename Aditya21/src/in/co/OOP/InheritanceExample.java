package in.co.OOP;

public class InheritanceExample {
     public static void main(String[] args) {
////    	 Parent class 
//	Shape S=new Shape();
//   System.out.println("Colour : "+S.getColour());
//  System.out.println("BoarderWidth : "+S.getBoarderWidth());
//   
   
////	  Kids All classes
   Circle x=new Circle(5);// if we take same 	  
   Traiangle T=new Traiangle(20,30);	  
   Rectangle R=new Rectangle(30,50);	  
   System.out.println("Area of Cirlce : "+x.Area());	  
   System.out.println("Areas of Traingle : "+T.area());
   System.out.println("Area of Rectangle : "+R.Area());
   }
}
