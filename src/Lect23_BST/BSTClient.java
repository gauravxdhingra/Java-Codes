package Lect23_BST;

public class BSTClient {

	public static void main(String[] args) {

		int[] in = { 10, 20, 30, 40, 50, 60, 70 };
		BST bst = new BST(in);
		bst.display();

		System.out.println(bst.size());
		System.out.println(bst.max());
		System.out.println(bst.ht());
		System.out.println(bst.find(4));

		// bst.printInRange(15, 55);

		// bst.replaceWithSumLarger();

		bst.display();

		bst.add(32);
		bst.add(35);
		bst.add(29);
		bst.display();

		bst.removeReturn(20);
		bst.display();
		bst.removeReturn(30);
		bst.display();
	}
}
