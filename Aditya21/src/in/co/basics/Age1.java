package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class Age1 {
	public static void main(String[] args) {
//		int Birth = 2004;
//		int CurrentDate = LocalDate.now().getYear();
//		int age = CurrentDate - Birth;
//		System.out.println("Age : " + age);
		 LocalDate birthDate = LocalDate.of(2004, 9, 25);
	        
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();
	        
	        // Calculate the period between the birth date and current date
	        Period age = Period.between(birthDate, currentDate);
	        
	        // Extract years, months, and days from the period
	        int years = age.getYears();
	        int months = age.getMonths();
	        int days = age.getDays();
	        
	        // Print the age
	        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days.");
}
}
