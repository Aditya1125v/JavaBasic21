package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("today Date  : " + str);
		Date d1 = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("25/09/2004");
		String str1 = format1.format(d1);
	  System.out.println("Actual Date = " + d - d1)
	}
}
