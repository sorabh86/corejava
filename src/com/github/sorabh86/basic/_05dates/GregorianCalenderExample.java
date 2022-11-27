package com.github.sorabh86.basic._05dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalenderExample {

	public static void main(String[] args) {

		int day, month, year, hour, minute, second;
		
		GregorianCalendar gc = new GregorianCalendar();
		day = gc.get(Calendar.DAY_OF_MONTH);
		month = gc.get(Calendar.MONTH);
		year = gc.get(Calendar.YEAR);
		hour = gc.get(Calendar.HOUR);
		minute = gc.get(Calendar.MINUTE);
		second = gc.get(Calendar.SECOND);
		
		System.out.println("Date: "+day+"/"+(month+1)+"/"+year);
		System.out.println("Time: "+hour+":"+minute+":"+second);
	}

}
