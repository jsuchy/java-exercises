public class IntegerStack {

	private int[] elements;
	private int topOfStack = -1;
	private int size = 10;

	public IntegerStack() {
		elements = new int[size];
	}
	
	public int size() {
		return nextTopOfStack();
	}

	public int push(int value) {
		if (nextTopOfStack() >= size)
			throw new StackLimitExceeded();
		
		elements[++topOfStack] = value;
		return value;
	}

	public int pop() {
		return elements[topOfStack--];
	}
	
	private int nextTopOfStack() {
		return topOfStack + 1;
	}
}