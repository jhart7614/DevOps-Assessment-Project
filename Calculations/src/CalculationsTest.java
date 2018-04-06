import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationsTest {

		@Test
		public void SubtractionTest() {
			Calculations testing = new Calculations();
			assertEquals("Actual was not expected", 8, testing.Subtraction(10, 2));
			
		}
		@Test
		public void DivisionTest() {
			Calculations testing = new Calculations();
			assertEquals("Actual was not expected", 5, testing.Division(10, 2));
			
		}
		@Test
		public void MultiplicationTest() {
			Calculations testing = new Calculations();
			assertEquals("Actual was not expected", 20, testing.Multiplication(10, 2));
			
		}
		@Test
		public void AdditionTest() {
			Calculations testing = new Calculations();
			assertEquals("Actual was not expected", 12, testing.Addition(10, 2));
			
		}
	}


