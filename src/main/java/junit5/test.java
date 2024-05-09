package junit5;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test {
	@BeforeEach
	public void beforEechTest() {
		System.out.println("Starting a boring test");
	}

	@BeforeAll
	public static void firstTest() {
		System.out.println("Started testing the great calculator app");
	}

	@Test
	public void addTest() {
		operations op = new operations();
		// System.out.println("Starting a boring test - add");
		double num1 = 5;
		double num2 = 10;
		double result = op.add(num1, num2);
		assertEquals(result, 15, 0.0001);
		result = op.add(5, -10);
		assertEquals(result, -5, 0.0001);
		result = op.add(-5, 10);
		assertEquals(result, 5, 0.0001);
		result = op.add(-5, -10);
		assertEquals(result, -15, 0.0001);
		result = op.add(5.0002656, 10.0000022);
		assertEquals(result, 15.0002678, 0.001);
		result = op.add(0,0);
		assertEquals(result, 0, 0.0001);
	
	}

	@Test
	public void subtractTest() {
		operations op = new operations();
		double num1 = 10;
		double num2 = 5;
		double result = op.subtract(num1, num2);
		assertEquals(result, 5, 0.0001);
		result = op.subtract(5, -10);
		assertEquals(result, 15, 0.0001);
		result = op.subtract(-5, 10);
		assertEquals(result, -15, 0.0001);
		result = op.subtract(-5, -10);
		assertEquals(result, 5, 0.0001);
		result = op.subtract(5.0002656, 10.0000022);
		assertEquals(result,-4.9997366, 0.001);
		result = op.subtract(0,0);
		assertEquals(result, 0, 0.001);
	}

	@Test
	public void multiplyTest() {
		operations op = new operations();
		double num1 = 5; 
		double num2 = 10;
		double result = op.multiply(num1, num2);
		assertEquals(result, 50, 0.0001);
		result = op.multiply(5, -10);
		assertEquals(result, -50, 0.0001);
		result = op.multiply(-5, 10);
		assertEquals(result, -50, 0.0001);
		result = op.multiply(-5, -10);
		assertEquals(result, 50, 0.0001);
		result = op.multiply(3.02, 6.66);
		assertEquals(result, 20.1132, 0.0001);
		result = op.multiply(0,0);
		assertEquals(result, 0, 0.0001);
	}

	@Test
	public void divideTest() {
		operations op = new operations();
		double num1 = 10;
		double num2 = 5;
		double result = op.divide(num1, num2);
		assertEquals(result, 2, 0.0001);
		result = op.divide(5, 10);
		
		assertEquals(result, 0.5, 0.0001);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			op.divide(1, 0);
		});
		result = op.divide(5, -10);
		assertEquals(result, -0.5, 0.0001);
		
		result = op.divide(-5, -10);
		assertEquals(result, 0.5, 0.0001);
		
		result = op.divide(8.4, 2.8);
		assertEquals(result, 3, 0.0001);

		
	}

	@AfterAll
	public static void finalTest() {
		System.out.println("Finished testing the great calculator app");
	}

	@AfterEach
	public void afterEechTest() {
		System.out.println("Finished a boring test");
	}
}
