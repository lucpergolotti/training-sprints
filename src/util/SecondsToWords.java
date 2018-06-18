package util;

public class SecondsToWords {

	public static String convertToWords(int sec) {
		String time = "";

		if (sec == 0) {
			time = "Zero Seconds";
		}
		if (sec >= 3600) {
			
		}
		if (sec >= 60 && sec > 0) {
			int minutes = sec / 60;
			if (minutes == 1) {
				time += " " + convertDigit(minutes) + " Minute";
			} else {
				time += " " + convertDigit(minutes) + " Minutes";
			}
			sec = sec % 60;
		}
		if (sec < 60 && sec > 0) {
			if (sec == 1) {
				time += " " + convertDigit(sec) + " Second";
			} else {
				time += " " + convertDigit(sec) + " Seconds";
			}
		}

		return time;
	}
	
	public static String convertDigit(int digit) {
		String digitString = "";
		switch (digit) {
		case 1:
			digitString = "One";
			break;
		case 2:
			digitString = "Two";
			break;
		case 3:
			digitString = "Three";
			break;
		case 4:
			digitString = "Four";
			break;
		case 5:
			digitString = "Five";
			break;
		case 6:
			digitString = "Six";
			break;
		case 7:
			digitString = "Seven";
			break;
		case 8:
			digitString = "Eight";
			break;
		case 9:
			digitString = "Nine";
			break;
		default:
			digitString = Integer.toString(digit);
		}
			
		return digitString;			
	}
}

