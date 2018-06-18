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
	public void convertSingleMinZeroSec() {
		assertThat(SecondsToWords.convertToWords(60), is("1 Minute"));
	}
	@Test
	public void convertSingleMinMultiSec() {
		assertThat(SecondsToWords.convertToWords(70), is("1 Minute 10 Seconds"));
	}

}
