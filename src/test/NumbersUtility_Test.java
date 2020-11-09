package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumbersUtility_Test {

	NumbersUtility numUtil = new NumbersUtility();

	@Test
	void testSmallestNumberLong() {
		long number = numUtil.istheSmallestNumberLong(1, 2);
		assertEquals(1, number);
	}

	@Test
	void testSmallestNumberFloat() {
		float number = numUtil.istheSmallestNumberFloat(3, 2);
		assertEquals(2, number);
	}

	@Test
	void testSmallestNumberInteger() {
		int number = numUtil.istheSmallestNumberInteger(1, 2);
		assertEquals(1, number);
	}

	@Test
	void testSmallestNumberDouble() {
		double number = numUtil.istheSmallestNumberDouble(0.0012, 0.0014);
		assertEquals(0.0012, number);
	}

	@Test
	void testBiggestNumberInteger() {
		int number = numUtil.istheBiggestNumberInteger(1, 2);
		assertEquals(2, number);
	}

	@Test
	void testBiggestNumberDouble() {
		double number = numUtil.istheBiggestNumberDouble(1.333, 0.33);
		assertEquals(1.333, number);
	}

	@Test
	void testBiggestNumberLong() {
		// NumbersUtility numUtilLongBig = new NumbersUtility();
		long number = numUtil.istheBiggestNumberLong(352, 283);
		assertEquals(352, number);
	}

	@Test
	void testExponentDouble() {
		double number = numUtil.exponentsOfANumber(4, 0.5);
		assertEquals(2, number);
	}

	@Test
	void testAdd() {
		int number = numUtil.addOneToNumber(23);
		assertEquals(24, number);
	}

	@Test
	void testAddLong() {
		long number = numUtil.addOnetoNumLong(35);
		assertEquals(36, number);
	}

	@Test
	void testSubtrInt() {
		int number = numUtil.subtractOneToNumber(35);
		assertEquals(34, number);
	}

	@Test
	void testSubtrLong() {
		long number = numUtil.subtractOneToNumberLong(24);
		assertEquals(23, number);
	}

	@Test
	void testSquareRt() {
		double number = numUtil.squareRootDouble(16);
		assertEquals(4, number);
	}

	@Test
	void testCubicRt() {
		double number = numUtil.cubicRoot(125.0);
		assertEquals(5, number);
	}

	@Test
	void testRandomNumber() {
		double number = numUtil.randNum();
		assertEquals(0.33, number);	
	}

}
