import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {

	private List<T> elements;

	public Stack() {
		elements = new LinkedList<T>();
	}
	
	public T push(T value) {
		elements.add(value);
		return value;
	}
	
	public T pop() {
		if (elements.isEmpty()) {
			throw new EmptyStackException();
		}
		return elements.remove(indexOfTopItem());
	}

	private int indexOfTopItem() {
		return elements.size() - 1;
	}
}