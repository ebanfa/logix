/**
 * 
 */
package com.cloderia.helion.client.shared.util;

/**
 * @author adrian
 *
 */
public class StringUtils {

	/**
	 * @param length
	 * @return
	 */
	public static String randomString(int length) {
		return new RandomString(length).nextString();
	}

	public static String validStringOrNull(String string) {
		if(isValidString(string)) return string;
		return null;
	}
	
	public static boolean isValidString(String string) {
		if(string == null)
			return false;
		else if (string.isEmpty())
			return false;
		else if (string.trim().equals(""))
			return false;
		return true;
	}
}
