import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApp {
	@Test
	public void testStackQueue() {
		System.out.println("Stack Vs Que");

		final Queue<String> queue = new LinkedList<String>();
		queue.add("first");
		queue.add("second");
		queue.add("third");
		System.out.println("Queue: " + queue.toString());

		Assert.assertEquals(queue.size(), 3);

		// Order FIFO
		// First in first out
		queue.remove();
		Assert.assertFalse(queue.contains("first"));
		queue.remove();
		Assert.assertFalse(queue.contains("second"));
		Assert.assertEquals(queue.peek(), "third");
		queue.remove();
		Assert.assertFalse(queue.contains("third"));
		
		Assert.assertEquals(queue.size(), 0);		

		final Stack<String> stack = new Stack<String>();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		
		// Order is LIFO
		// Last in first out
		
		stack.pop();
		Assert.assertFalse(stack.contains("third"));		
		stack.pop();
		Assert.assertFalse(stack.contains("second"));
		stack.pop();
		Assert.assertFalse(stack.contains("first"));
		
		Assert.assertEquals(stack.size(), 0);
	}

}
