package OOP_Inheritance;

class Derived extends Base {
	int y;
	Derived(int a, int b) {
		super(a); //CALLING THE CONSTRUCTOR OF THE SUPER CLASS
		this.y = b;
	}
	void Display() {
		System.out.println("x = "+a+", y = "+y);
	}
}
