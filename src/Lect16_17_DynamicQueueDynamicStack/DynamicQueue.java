package Lect16_17_DynamicQueueDynamicStack;

import Lect15_StackQueue.Queue;


public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * data.length];

			for (int i = 0; i < size(); i++) {
				int idx = (i + front) % data.length;
				na[i] = data[idx];
			}

			data = na;
			front = 0;

		}

		super.enqueue(item);

	}
}
