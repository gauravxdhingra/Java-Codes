package Lect1_Basics;

public class ConditionalDemo {

	public static void main(String[] args) {

		int marks = 10;
		int pack = 10 ;

		if (marks > 50 && pack == 5) {
			System.out.println("v. good");
		} else if (marks > 40 || pack > 3) {
			System.out.println("good");
		} else if (marks > 30) {
			System.out.println("avg");
		} 
		
		System.out.println("bye");

	}
}




