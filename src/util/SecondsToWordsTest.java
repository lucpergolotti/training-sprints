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
	

}
