package util;

public class SecondsToWords {

	public static String convertToWords(int sec) {
		String time = "";

		if (sec == 0) {
			time = "0 Seconds";
		}
		if (sec >= 604800 && sec > 0) {
			int weeks = sec / 604800;
			if (weeks == 1) {
				time += " " + weeks + " Week";
			} else {
				time += " " + weeks + " Weeks";
			}
			sec = sec % 604800;
		}
		if (sec >= 86400 && sec > 0) {
			int days = sec / 86400;
			if (days == 1) {
				time += " " + days + " Day";
			} else {
				time += " " + days + " Days";
			}
			sec = sec % 86400;
		}
		if (sec >= 3600 && sec > 0) {
			int hours = sec / 3600;
			if (hours == 1) {
				time += " " + hours + " Hour";
			} else {
				time += " " + hours + " Hours";
			}
			sec = sec % 3600;
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

