import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FactorsTest {

	private List<Integer> list(int... primes) {
		List<Integer> list = new ArrayList<Integer>();
		for (int prime : primes) {
			list.add(prime);
		}
		return list;
	}
	
	@Test
	public void factorsOfOne() {
		assertEquals(list(), Factors.of(1));
	}
	
	@Test
	public void factorsOfTwo() {
		assertEquals(list(2), Factors.of(2));
	}
	
	@Test
	public void factorsOfThree() {
		assertEquals(list(3), Factors.of(3));
	}
	
	@Test
	public void factorsOfFour() {
		assertEquals(list(2, 2), Factors.of(4));
	}
	
	@Test
	public void factorsOfSix() {
		assertEquals(list(2, 3), Factors.of(6));
	}
	
	@Test
	public void factorsOfEight() {
		assertEquals(list(2, 2, 2), Factors.of(8));
	}
	
	@Test
	public void factorsOfNine() {
		assertEquals(list(3, 3), Factors.of(9));
	}
}
