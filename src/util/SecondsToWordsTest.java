package util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SecondsToWordsTest {

	@Test
	public void convertZeroSeconds() {
		assertThat(SecondsToWords.convertToWords(0), is("Zero Seconds"));
	}
	@Test
	public void convertOneSecond() {
		assertThat(SecondsToWords.convertToWords(1), is(" One Second"));
	}
	
	@Test
	public void convertSingleMinZeroSec() {
		assertThat(SecondsToWords.convertToWords(60), is(" One Minute"));
	}
	@Test
	public void convertSingleMinMultiSec() {
		assertThat(SecondsToWords.convertToWords(70), is(" One Minute 10 Seconds"));
	}
	@Test
	public void convertMultipleMin() {
		assertThat(SecondsToWords.convertToWords(135), is(" Two Minutes 15 Seconds"));
	}
	@Test
	public void convertLessThanMinute() {
		assertThat(SecondsToWords.convertToWords(50), is(" 50 Seconds"));
	}
	@Test
	public void convertMoreThanWeek() {
		assertThat(SecondsToWords.convertToWords(604800 + 86400 +3600 + 60 + 60), is(" One Week One Day One Hour One Minute One Second"));
	}

}
