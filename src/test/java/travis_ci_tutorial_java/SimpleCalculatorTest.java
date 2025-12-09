package travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(3, 1), 2);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(1, 1), 2);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(10, 0), 0);
	}
}
