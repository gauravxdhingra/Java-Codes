package Lect18_Adapters_DS.Adapters;

import L16_17_DynamicQueueDynamicStack.DynamicQueue;


public class StackUsingQueuePushEff {

	DynamicQueue primary = new DynamicQueue();

	public void push(int item) throws Exception {

		try {
			primary.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full.");
		}
	}

	public int pop() throws Exception {

		try {
			DynamicQueue helper = new DynamicQueue();

			while (primary.size() != 1) {
				helper.enqueue(primary.dequeue());
			}

			int temp = primary.dequeue();
			primary = helper;
			return temp;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public int top() throws Exception {

		try {
			DynamicQueue helper = new DynamicQueue();

			while (primary.size() != 1) {
				helper.enqueue(primary.dequeue());
			}

			int temp = primary.dequeue();
			helper.enqueue(temp);

			primary = helper;
			return temp;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public void display() throws Exception {
		displayReverse(0);
		System.out.println(".");
	}

	private void displayReverse(int count) throws Exception {

		if (count == primary.size()) {
			return;
		}

		int temp = primary.dequeue();
		primary.enqueue(temp);

		displayReverse(count + 1);

		System.out.print(temp + " ");

	}

}
