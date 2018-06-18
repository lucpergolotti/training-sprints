package util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SecondsToWordsTest {

	@Test
	public void convertZeroSeconds() {
		assertThat(SecondsToWords.convertToWords(0), is("0 Seconds"));
	}
	@Test
	public void convertOneSecond() {
		assertThat(SecondsToWords.convertToWords(1), is(" 1 Second"));
	}
	
	@Test
	public void convertSingleMinZeroSec() {
		assertThat(SecondsToWords.convertToWords(60), is(" 1 Minute"));
	}
	@Test
	public void convertSingleMinMultiSec() {
		assertThat(SecondsToWords.convertToWords(70), is(" 1 Minute 10 Seconds"));
	}
	@Test
	public void convertMultipleMin() {
		assertThat(SecondsToWords.convertToWords(135), is(" 2 Minutes 15 Seconds"));
	}
	@Test
	public void convertLessThanMinute() {
		assertThat(SecondsToWords.convertToWords(50), is(" 50 Seconds"));
	}
	@Test
	public void convertSingleHour() {
		assertThat(SecondsToWords.convertToWords(3600), is(" 1 Hour"));
	}
	@Test
	public void convertMultipleHours() {
		assertThat(SecondsToWords.convertToWords(7200), is(" 2 Hours"));
	}
	@Test
	public void convertMultipleHoursWithMinutes() {
		assertThat(SecondsToWords.convertToWords(7320), is(" 2 Hours 2 Minutes"));
	}
	@Test
	public void convertMultipleHoursWithMinutesAndSeconds() {
		assertThat(SecondsToWords.convertToWords(7322), is(" 2 Hours 2 Minutes 2 Seconds"));
	}
	public void convertOneDayWithHours() {
		assertThat(SecondsToWords.convertToWords(86400+3600), is(" 1 Day 1 Hour"));
	}
	@Test
	public void convertOneDayWithHoursAndMinutes() {
		assertThat(SecondsToWords.convertToWords(86400+3600+180), is(" 1 Day 1 Hour 3 Minutes"));
	}
	@Test
	public void convertOneDayWithHoursWithMinutesAndSeconds() {
		assertThat(SecondsToWords.convertToWords(86400+3600+180+25), is(" 1 Day 1 Hour 3 Minutes 25 Seconds"));
	}
	@Test
	public void convertOneDay() {
		assertThat(SecondsToWords.convertToWords(86400), is(" 1 Day"));
	}
	@Test
	public void convertMultipleDays() {
		assertThat(SecondsToWords.convertToWords(86400*4), is(" 4 Days"));
	}
}