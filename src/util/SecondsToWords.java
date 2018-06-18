package util;

public class SecondsToWords {
	
	public static String convertToWords(int sec) {
		String time = null;
		
		if(sec == 0) {
			time = "Zero Seconds";
		}
		
		return time;
	}
}
