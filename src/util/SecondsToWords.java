package util;

public class SecondsToWords {

	public static String convertToWords(int sec) {
		String time = "";

		if (sec == 0) {
			time = "0 Seconds";
		}
		if (sec >= 3600) {
			
		}
		if (sec >= 60 && sec > 0) {
			int minutes = sec / 60;
			if (minutes == 1) {
				time += " " + minutes + " Minute";
			} else {
				time += " " + minutes + " Minutes";
			}
			sec = sec % 60;
		}
		if (sec < 60 && sec > 0) {
			if (sec == 1) {
				time += " 1 Second";
			} else {
				time += " " + sec + " Seconds";
			}
		}

		return time;
	}
}

