package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {
	// Testing for add method :
	@Test
	void test_1() {
		calculator obj=new calculator();
		assertEquals(5, obj.add(6, -1));
		
	}
	@Test
	void test_2() {
		calculator obj=new calculator();
		assertEquals(6, obj.add(5, 1));
		
	}
	@Test
	void test_3() {
		calculator obj=new calculator();
		assertEquals(-7, obj.add(-2, -5));	
	}
	@Test
	void test_4() {
		calculator obj=new calculator();
		assertEquals(3, obj.add(-2, 5));	
	}
	
	// Testing for divide method :
	@Test
	void test_5() {
		calculator obj=new calculator();
		assertEquals(5, obj.divide(5, 1));
		
	}
	@Test
	void test_6() {
		calculator obj=new calculator();
		assertEquals(-6, obj.divide(-6, 1));	
	}
	@Test
	void test_7() {
		calculator obj=new calculator();
		float t=(float)7/3;
		assertEquals(t, obj.divide(7, 3));
		
	}
	@Test
	void test_8() {
		calculator obj=new calculator();
		assertEquals(0, obj.divide(0, 3));
		
	}
	@Test
	void test_9() {
		calculator obj=new calculator();
		assertEquals(4.5, obj.divide(9, 2));
		
	}
	@Test
	void test_10() {
		calculator obj=new calculator();
		ArithmeticException thrown = assertThrows (ArithmeticException.class,() -> obj.divide(5,0)); 
		assertEquals("Error,Division by zero",thrown.getMessage());
	}
}
