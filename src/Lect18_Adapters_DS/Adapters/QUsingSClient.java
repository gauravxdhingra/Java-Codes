package Lect18_Adapters_DS.Adapters;


public class QUsingSClient {

	public static void main(String[] args) throws Exception {

		QueueUsingStackDeqEff queue = new QueueUsingStackDeqEff();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		queue.display();

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		queue.enqueue(60);
		queue.enqueue(70);

		queue.display();

	}
}
