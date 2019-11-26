package Lect33_DynamicStack;


public abstract class DS {

	int size;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public abstract void display();
}
