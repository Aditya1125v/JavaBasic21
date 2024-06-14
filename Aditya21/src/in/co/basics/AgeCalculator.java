package in.co.basics;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Date;

public class AgeCalculator {

	    public static void main(String[] args) {
	        String birthDateString = "25/09/2004";
	        
	        try {
	            // Parse the birth date string into a Date object
	            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	            Date birthDate = format.parse(birthDateString);
	            
	            // Get the current date
	            LocalDate currentDate = LocalDate.now();
	            
	            // Convert birthDate to LocalDate
	            LocalDate birthLocalDate = LocalDate.of(
	                    birthDate.getYear() + 1900, 
	                    birthDate.getMonth() + 1, 
	                    birthDate.getDate());
	            
	            // Calculate the age
	            Period age = Period.between(birthLocalDate, currentDate);
	            
	            System.out.println("Current Date = " + currentDate);
	            System.out.println("Birth Date = " + birthLocalDate);
	            System.out.println("Age = " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
	            
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	}
