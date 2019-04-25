package com.macro.springboot.utils.cryptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

public class Md5Cryptor {
	private static final Logger LOGGER = LoggerFactory.getLogger(Md5Cryptor.class);

	public static String encrypt(String plainText, boolean is16Bype) {
		String result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}

			result = is16Bype ?  buf.toString().substring(8, 24) :buf.toString();
		} catch (Exception e) {
			LOGGER.error("Exception: " + e.getMessage(), e);
		}
		return result;
	}
}
