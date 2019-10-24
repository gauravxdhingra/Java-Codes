package Lect16_17_DynamicQueueDynamicStack;

import Lect15_StackQueue.Stack;



public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {

		// work only when stack is already full
		if (isFull()) {

			// create a new array of twice size
			int[] na = new int[2 * data.length];

			// copy the previous values
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}

			// change the reference
			data = na;

		}

		super.push(item);
	}
}















