import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest {

	UniqueSum uniqueSum = new UniqueSum();
	
	@Test
	public void test() {
		assertEquals(6, UniqueSum.uniqueSum(1, 2, 3));
		assertEquals(0, UniqueSum.uniqueSum(3, 3, 3));
		assertEquals(3, UniqueSum.uniqueSum(1, 2, 2));
		assertEquals(3, UniqueSum.uniqueSum(1, 2, 1));
	}

}
