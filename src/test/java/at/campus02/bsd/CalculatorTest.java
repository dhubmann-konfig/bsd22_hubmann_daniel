/*
 * CalculatorTest
 * Represents Test for Calculator Class
 * 
 */
package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class CalculatorTest {

	Calculator c;

	@BeforeEach
	public void setUp() {
		c = new Calculator();
	}

	@Test
	public void testAdd1() {
		Assertions.assertEquals(0, c.add(1, -1));
	}

	@Test
	public void testAdd2() {
		Assertions.assertEquals(-2, c.add(-1, -1));
	}

	@Test
	public void testAdd3() {
		Assertions.assertEquals(1, c.add(2, -1));
	}

	@Test
	public void testMinus1() {
		Assertions.assertEquals(-1, c.minus(0, 1));
	}

	@Test
	public void testMinus2() {
		Assertions.assertEquals(0, c.minus(-1, -1));
	}

	@Test
	public void testMinus3() {
		Assertions.assertEquals(2, c.minus(1, -1));
	}

	@Test
	public void testDivide1() {
		Assertions.assertEquals(1, c.divide(1, 1));
	}

	@Test
	public void testDivide2() {
		Assertions.assertEquals(0.5, c.divide(1, 2));
	}

	@Test
	public void testDivide3() {
		Assertions.assertEquals(2, c.divide(10, 5));
	}

	@Test
	public void testMultiply1() {
		Assertions.assertEquals(0, c.multiply(123, 0));
	}

	@Test
	public void testMultiply2() {
		Assertions.assertEquals(-1, c.multiply(1, -1));
	}

	@Test
	public void testMultiply3() {
		Assertions.assertEquals(1, c.multiply(-1, -1));
	}

	@Test
	public void testFactorial1() {
		Assertions.assertEquals(0, c.factorial(-1));
	}

	@Test
	public void testFactorial2() {
		Assertions.assertEquals(120, c.factorial(5));

	}

	@Test
	public void testFactorial3() {
		Assertions.assertEquals(3628800L, c.factorial(10));
	}
	
	@Test
	public void testFactorial4() {
		Assertions.assertEquals(1, c.factorial(0));
	}

}
