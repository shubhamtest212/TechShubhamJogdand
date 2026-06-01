package Practices_Codes;

public class Method_Overriding_2 extends Method_Overriding_1 {

	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {

		Method_Overriding_2 mo2 = new Method_Overriding_2();
		mo2.eat();

	}
}

// Method overriding is not possible in single class but Method overloading is possible
// int a, int b = Number of paramaters are 2 and types of parameters are also 2
