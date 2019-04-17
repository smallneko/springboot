package com.macro.springboot.utils.validation;

import java.util.regex.Pattern;

public class FormatValidator {

	private static final Pattern EMAIL_PATTERN =
			Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	/**
	 * 3097784234
	 */
	private static final Pattern PHONE_PATTERN =
			//Pattern.compile("^[+]?[01]?[- .]?(\\([2-9]\\d{2}\\)|[2-9]\\d{2})[- .]?\\d{3}[- .]?\\d{4}$");
			Pattern.compile("\\d{10}$");


	public static boolean validateEmail(String email){
		return EMAIL_PATTERN.matcher(email).matches();
	}

	public static boolean validatePhone(String phone){
		return PHONE_PATTERN.matcher(phone).matches();
	}

}
