import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack<Integer> stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new Stack<Integer>();
	}

	@Test(expected = InvalidStackOperation.class)
	public void popEmptyStackThrowsError() {
		stack.pop();
	}
	
	@Test
	public void popReturnsPushedElement() {
		stack.push(0);
		stack.push(314);
		stack.push(42);
		assertEquals((Integer)42, stack.pop());
		assertEquals((Integer)314, stack.pop());
		assertEquals((Integer)0, stack.pop());
	}
}
