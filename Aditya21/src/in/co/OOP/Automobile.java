package in.co.OOP;

import javax.swing.Spring;

public class Automobile {
private int Gear ;
private String colour;
private int speed;
private String maker;
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getMaker() {
	return maker;
}
public void setMaker(String maker) {
	this.maker = maker;
}
public void setGear(int gear){ 
	this.Gear = gear;
}
public void showMaximumSpeed() { 
    if (Gear == 0) {
        System.out.println("The car is in Nutral gear");
    } else if (Gear == 1) {
        System.out.println("The maximum Speed in this gear is 25km/h");
    } else if (Gear == 2) {
        System.out.println("The maximum Speed in this gear is 50km/h");
    } else if (Gear == 3) {
        System.out.println("The maximum Speed in this gear is 75km/h");
    } else if (Gear == 4) {
        System.out.println("The maximum Speed in this gear is 100km/h");
    } else if (Gear == 5) {
        System.out.println("The maximum Speed in this gear is 125km/h");
    } else if (Gear > 5) { 
        System.out.println("The maximum Speed in this gear is 150km/h");
}
    }
	public static void main(String[] args) {
	   Automobile A=new Automobile();
	   A.setColour("White");
	   A.setMaker("Ford");
	   A.setSpeed(240);
	   A.setGear(4);
	   A.showMaximumSpeed();
	  
	   System.out.println(A.getColour());
	   System.out.println(A.getMaker());
	   System.out.println(A.getSpeed());
	   
}}