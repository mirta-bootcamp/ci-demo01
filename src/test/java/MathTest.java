import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testSum() {
		assertEquals(3, Math.sum(1, 2));
	}
	
	@Test
	void testDivide() {
		assertEquals(3, Math.divide(9, 3));
	}

}
