import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class QueueFromStack {
	Stack<Integer> temp = new Stack<Integer>();
	Stack<Integer> value = new Stack<Integer>();
	Map<String,String> test = new HashMap<String, String>();

	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
		
		
	}

	public void push(int x) {

		if (value.isEmpty()) {
			value.push(x);
		} else {
			while (!value.isEmpty()) {
				temp.push(value.pop());
			}
		}
		value.push(x);

		while (!temp.isEmpty()) {
			value.push(temp.pop());
		}

	}

	public void pop() {
		value.pop();
	}

	// Get the front element.
	public int peek() {
		return value.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return value.isEmpty();
	}
}
