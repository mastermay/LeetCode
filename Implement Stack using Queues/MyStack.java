import java.util.LinkedList;

public class MyStack {
	private LinkedList<Integer> list = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		list.addFirst(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		list.removeFirst();
	}

	// Get the top element.
	public int top() {
		return (int) list.getFirst();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return list.size() == 0;
	}
}