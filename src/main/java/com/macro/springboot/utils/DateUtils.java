package com.macro.springboot.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUtils {

	private DateUtils() {
	}

	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String AGS_GMT_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String UTC_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss z";
	public static final TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
	public static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
	public static final Date DEFAULT_VALIDITY_END_DATE;
	public static final Date CURRENT_DATE;

	static {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		calendar.set(Calendar.YEAR, 9999);
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);

		DEFAULT_VALIDITY_END_DATE = calendar.getTime();
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(Calendar.MILLISECOND, 0);
		CURRENT_DATE = cal.getTime();
	}

	public static SimpleDateFormat getDefaultDateFormat() {
		return new SimpleDateFormat(DEFAULT_DATE_PATTERN);
	}

	public static SimpleDateFormat getUTCDateFormat() {
		SimpleDateFormat format = new SimpleDateFormat(UTC_DATE_PATTERN);
		format.setTimeZone(UTC_TIME_ZONE);
		return format;
	}

	public static SimpleDateFormat getGMTDateFormat() {
		SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
		format.setTimeZone(GMT_TIME_ZONE);
		return format;
	}

	public static SimpleDateFormat getAGSGMTDateFormat() {
		SimpleDateFormat format = new SimpleDateFormat(AGS_GMT_DATE_PATTERN);
		format.setTimeZone(GMT_TIME_ZONE);
		return format;

	}

	public static Timestamp getTimeStampEndDate() {
		String strDate = "9999-12-31 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date;
		try {
			date = sdf.parse(strDate);

			return new Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}
}
