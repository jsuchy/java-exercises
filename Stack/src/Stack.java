import java.util.LinkedList;
import java.util.List;

public class Stack<T> {

	private List<T> elements;

	public Stack() {
		elements = new LinkedList<T>();
	}
	
	public T pop() {
		if (elements.isEmpty()) {
			throw new InvalidStackOperation();
		}
		return elements.remove(elements.size() - 1);
	}

	public T push(T value) {
		elements.add(value);
		return value;
	}
}