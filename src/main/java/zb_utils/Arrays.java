package zb_utils;

public class Arrays {
	/**
	 * Makes a String array of the String representation of each element in an
	 * array of objects.
	 * @param data An array of objects
	 * @return String array of the String representation of each element in the
	 * array of objects
	 */
	public static String[] eachToString(Object[] data) {
		String[] dataStrings = new String[data.length];
		
		for (int i = 0; i < data.length; i++)
			dataStrings[i] = data[i].toString();
		
		return dataStrings;
	}
	
	/**
	 * Makes a String array of the String representation of each element in an
	 * array of ints.
	 * @param data An array of ints
	 * @return String array of the String representation of each element in the
	 * array of ints
	 */
	public static String[] eachToString(int[] data) {
		String[] dataStrings = new String[data.length];
		
		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];
		
		return dataStrings;
	}
	
	public static String[] concatenate(String[] a, String[] b) {
		String[] c = new String[a.length + b.length];
		
		for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		for (int i = a.length; i < a.length + b.length; i++) {
			c[i] = b[i - a.length];
		}
		
		return c;
	}
}
