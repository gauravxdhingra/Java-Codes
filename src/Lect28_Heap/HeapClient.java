package Lect28_Heap;

import java.util.ArrayList;

public class HeapClient {

	public static void main(String[] args) {
		
		Heap heap = new Heap() ;
		
		heap.add(10);
		heap.display();
		heap.add(5);
		heap.display();
		heap.add(7);
		heap.display();
		heap.add(45);
		heap.display();
		heap.add(2);
		heap.display();
		
		while(!heap.isEmpty()) {
			System.out.println(heap.remove());
			heap.display();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
