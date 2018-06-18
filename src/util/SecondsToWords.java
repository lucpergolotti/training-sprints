package util;

public class SecondsToWords {
	
	public static String convertToWords(int sec) {
		String time = "";
		
		if(sec == 0) {
			time = "0 Seconds";
		}
		
		if(sec >= 60) {
			int minutes = sec / 60;
			if(minutes == 1) {
				time += minutes + " Minute";
			} else {
				time += minutes + " Minutes";
			}
			sec = sec % 60;
		}
		
		return time;
	}
}
