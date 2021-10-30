package pck;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static java.time.Duration.*;

class MathTests {
	public Math math;
	public int[] arr;
	
	@BeforeEach
	void setup() {
		arr = new int[]{18,5,36,2,1,7,9,24,30};
		math = new Math();
	}

	@Test
	@DisplayName("Test Getting Odd Numbers")
	void GetOddNumbersTest() {		
		assertArrayEquals(new int[] {5,1,7,9}, math.GetOddNumbers(arr));
	}
	
	@Test
	@DisplayName("Test Getting Even Numbers")
	void GetEvenNumbersTest() {
		assertArrayEquals(new int[] {18,36,2,24,30}, math.GetEvenNumbers(arr));
	}
	
	@Test
	@DisplayName("Test Getting Prime Numbers")
	void GetPrimeNumbersTest() {
		assertArrayEquals(new int[] {5,2,1,7}, math.GetPrimeNumbers(arr));
	}
	
	@Test
	@DisplayName("Test Prime Number")
	void isPrimeTest() {
		int num=317;
		assertEquals(true, math.isPrime(num));
	}
	
	@DisplayName("Test isPrime with different values")
	@ParameterizedTest
	@CsvSource({"5, true","78, false","31, true","23, true","60, false","19, true"})
	void primeTestWithDifferentValues(int num,boolean result) {
		assertEquals(result, math.isPrime(num));
	}
	
	@RepeatedTest(10)
	@DisplayName("Repeated Game Test")
	void gameTest() {
		assertTrue(math.Game());
	}
	
	@BeforeAll
	static void setupAll() {
		System.setProperty("ENV", "PROD");
	}
	
	@Test
	void testOnProduction() {
		Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")), MathTests::Message);        
        System.out.println("testOnProduction was run.");

	}
	
	private static String Message() {
		return "Test was not run";
	}
	
	@Test
	@DisplayName("Is Prime Performance Test")
	void isPrimePerformanceTest() {
		Random rnd = new Random();
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<1000000;i++) {
			int num = rnd.nextInt(100);
			numbers.add(num);
		}
		assertTimeout(ofMillis(10), () -> {
            math.GetPrimeNumbers(numbers.stream().mapToInt(i->i).toArray());
        });

	}
}
