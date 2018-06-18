package util;

public class SecondsToWords {
	
	public static String convertToWords(int sec) {
		String time = null;
		
		if(sec == 0) {
			time = "0 Seconds";
		}
		else if(sec < 60) {
			time = Integer.toString(sec) + " Seconds";
		}
		
		return time;
	}
}
