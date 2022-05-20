package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
			System.out.println(i);
		} 
		
		catch (ArithmeticException e) {
			System.out.println("some ex is coming..");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("inside finally block...");
		}

	}

}
