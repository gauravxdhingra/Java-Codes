package Lect18_Adapters_DS.Adapters;

import L16_17_DynamicQueueDynamicStack.DynamicStack;


public class QueueUsingStackDeqEff {

    DynamicStack primary = new DynamicStack();

    public void enqueue(int item) throws Exception {

        try {
            DynamicStack helper = new DynamicStack();

            while (!primary.isEmpty()) {
                helper.push(primary.pop());
            }

            helper.push(item);

            while (!helper.isEmpty()) {
                primary.push(helper.pop());
            }
        } catch (Exception e) {
            throw new Exception("Queue is Full.");
        }

    }

    public int dequeue() throws Exception {

        try {
            return primary.pop();
        } catch (Exception e) {
            throw new Exception("Queue is Empty.");
        }
    }

    public int getFront() throws Exception {

        try {
            return primary.top();
        } catch (Exception e) {
            throw new Exception("Queue is Empty.");
        }

    }

    public void display() {
        primary.display();
    }

}
