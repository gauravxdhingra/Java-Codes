package Lect15_StackQueue.OOPS_Story1;

public class Student {

	// data members
	String name = "XYZ";
	int age = 25;

	// default constructor
	public Student() {
		System.out.println("in dc");
	}

	// parameterised constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduceYourself() {
		System.out.println(name + " is " + age + " years old.");
	}

	public void sayHi(String name) {
		System.out.println(this.name + " says hi to " + name);
	}

}
