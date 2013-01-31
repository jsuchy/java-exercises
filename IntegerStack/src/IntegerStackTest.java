import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IntegerStackTest {

	private IntegerStack stack;

	@Before
	public void setUp() throws Exception {
		stack = new IntegerStack();
	}

	@Test
	public void emptyStackHasSizeOfZero() {
		assertEquals(0, stack.size());
	}
	
	@Test
	public void pushIncreasesSizeToOne() {
		stack.push(1);
		assertEquals(1, stack.size());
	}
	
	@Test
	public void popReturnsTopElement() {
		stack.push(2);
		assertEquals(2, stack.pop());
	}
	
	@Test
	public void multiplePushesAndPops() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
	}
	
	@Test(expected = StackLimitExceeded.class)
	public void throwsExceptionWhenEleventhElementIsPushed() {
		for (int i=0; i<=10; i++) {
			stack.push(i);
		}
		
	}
}
