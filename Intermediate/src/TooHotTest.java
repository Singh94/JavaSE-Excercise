import static org.junit.Assert.*;

import org.junit.Test;

public class TooHotTest {

	TooHot tooHot = new TooHot();
	int tempLowerBound = 60;
	int tempUpperBound = 90;
	
	@Test
	public void test() {
		assertEquals(true, TooHot.inRange(true, 80, tempLowerBound, tempUpperBound));
		assertEquals(true, TooHot.inRange(true, 60, tempLowerBound, tempUpperBound));
		assertEquals(false, TooHot.inRange(true, 59, tempLowerBound, tempUpperBound));
		assertEquals(true, TooHot.inRange(true, 90, tempLowerBound, tempUpperBound));
		assertEquals(false, TooHot.inRange(true, 91, tempLowerBound, tempUpperBound));
		assertEquals(true, TooHot.inRange(true, 100, tempLowerBound, 100));
		assertEquals(false, TooHot.inRange(false, 100, tempLowerBound, 100));
	}


}
