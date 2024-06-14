package in.co.basics;

import java.util.Date;

public class DateFormatBasic {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println("Long Time " + d.getTime());
		System.out.println(d.getHours());
		System.out.println(d.getHours());
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getSeconds());
		System.out.println(d.getTimezoneOffset());
		System.out.println(d.getYear());
		System.out.println(d.getDate());
		System.out.println(d.getClass());

	}
}
