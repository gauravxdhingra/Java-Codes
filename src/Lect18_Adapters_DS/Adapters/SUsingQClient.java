package Lect18_Adapters_DS.Adapters;


public class SUsingQClient {

	public static void main(String[] args) throws Exception {

		StackUsingQueuePushEff stack = new StackUsingQueuePushEff();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.display();
		
		System.out.println(stack.pop());
		
		stack.display();
	}
}
