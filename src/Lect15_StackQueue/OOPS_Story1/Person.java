package Lect15_StackQueue.OOPS_Story1;

public class Person {

	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age < 0) {
			throw new RuntimeException("Invalid Age.");
		}

		this.age = age;
	}

	public void fun(int age) {

		System.out.println("hi fun");
		setAge(age);
		System.out.println("bye fun");
	}

	public String toString() {
		return name + " " + age ;
	}
}
