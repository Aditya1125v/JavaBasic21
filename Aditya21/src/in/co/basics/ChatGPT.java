package in.co.basics;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class ChatGPT {
	    public static void main(String[] args) throws ParseException {
	        // Current date
	        Date currentDate = new Date();
	        SimpleDateFormat format = new SimpleDateFormat();
	        String currentDateString = format.format(currentDate);
	        System.out.println("Today's Date: " + currentDateString);

	        // Specific date
	        String specificDateString = "25/09/2004";
	        SimpleDateFormat specificDateFormat = new SimpleDateFormat();
	        Date specificDate = specificDateFormat.parse(specificDateString);

	        // Calculate difference
	        long differenceInMillis = currentDate.getTime() - specificDate.getTime();
	 

	        System.out.println("Difference in days: " + differenceInMillis);
	    }
	}



