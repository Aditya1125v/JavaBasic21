package in.co.OOP;

import java.time.LocalDate;
import java.util.Date;

public class Person1 {
	
		private String name;
		private int birthYear;
		private int salary;
		private String address;
		private String dob;
		
	  public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
	public String getName() {
		  return name;
	  }
	  public void setName(String name){
		  this.name=name;
	  }
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void Age(int birthYear){
		int CurrentDate = LocalDate.now().getYear();
		int age = CurrentDate - birthYear;
		System.out.println("Age : " + age);}

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.setName("Aditya");
		p.setBirthYear(2005);
		p.setDob("25/09/2004");
		p.setSalary(25000);
		p.setAddress("Indore");
		 
		
		
		System.out.println(p.getName());
		System.out.println(p.getSalary());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		 Age(p.getBirthYear());		
	}
}