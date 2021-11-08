package by.epam.learn.collections.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(15);
		stack.push(1);
		while (!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(10);
		queue.offer(100);
		queue.offer(6);
		while (!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}

}
