import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FactorsTest {

	private List<Integer> list(int... ints) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ints) {
			list.add(i);
		}
		return list;
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), Factors.of(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), Factors.of(2));
	}
	
	@Test
	public void TestThree() {
		assertEquals(list(3), Factors.of(3));
	}
	
	@Test
	public void TestFour() {
		assertEquals(list(2, 2), Factors.of(4));
	}
	
	@Test
	public void TestFive() {
		assertEquals(list(5), Factors.of(5));
	}
	
	@Test
	public void TestSix() {
		assertEquals(list(2, 3), Factors.of(6));
	}
	
	@Test
	public void TestEight() {
		assertEquals(list(2, 2, 2), Factors.of(8));
	}
	
	@Test public void TestNine() {
		assertEquals(list(3, 3), Factors.of(9));
	}
}
