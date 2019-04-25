package com.macro.springboot.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimestampFormat {

	public static String format(Date date, String format){
		DateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}

	public static String format(Calendar cal, String format){
		DateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(cal.getTime());
	}

	public static String format(long input, String format){
		Date date = new Date(input);
		Calendar cal = new GregorianCalendar();
		DateFormat dateFormat = new SimpleDateFormat(format);
		dateFormat.setCalendar(cal);
		cal.setTime(date);
		return dateFormat.format(date);
	}

}
