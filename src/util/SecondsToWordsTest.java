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
	public void convertLessThanMinute() {
		assertThat(SecondsToWords.convertToWords(50), is("50 Seconds"));
	}

}
