package java8;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MainTest {

	@Test
	public void shouldReverseAList() {
		assertThat(Main.reverse(Arrays.asList(5,4,3,2,1)), is(equalTo(Arrays.asList(1,2,3,4,5))));
		assertTrue("they are same", Main.reverse(Arrays.asList(3,2,1)).equals(Arrays.asList(1,2,3)));
	}
	
	@Test
	public void shouldSortAList() {
		assertThat(Main.sorted(Arrays.asList(5,4,3,2,1)), is(equalTo(Arrays.asList(1,2,3,4,5))));
	}
	
	@Test
	public void calSumGreaterThanANumber() {
		assertTrue(Main.calSumGreaterThanANumber(Arrays.asList(12,13,25,1,9,3), 5) == 59);
	}
}
