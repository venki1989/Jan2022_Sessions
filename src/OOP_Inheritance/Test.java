package OOP_Inheritance;

public class Test {

	//compile time -- static
	public void m1() {

	}

	public void m1(int a) {

	}

	public void m1(int a, int b) {

	}
	public final void m1(int a, String h) {

	}
	public final void m1(double d) {

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10, 20);
		t.m1();
	}

}
