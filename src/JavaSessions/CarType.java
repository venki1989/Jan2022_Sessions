package JavaSessions;

import java.util.Arrays;

public class CarType {

	String name;
	int price;
	String color;
	static final int wheels = 4;   //The Static variable are stored in 
	//Comman memeory(MetaSpace), static values will not be assigned to the object
	
	//MAin method is stored in MetaSpace
	//Static method, Static varialble are stored in COmman space
	//to call static varialbe no nned to create an object
	//TO call Static method alos no need to create an object
	

	public static void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}
	public String arrayList(String car)
	{

		String cooper = "cooper";	
		String sed = "sedan";
		
		if(car.equals(sed)) {
			String[] sedan = new String[3];
			sedan[0]="tigor";
			sedan[1]="swift";
			sedan[2]="beat";
			return Arrays.toString(sedan); 

		}

		else if(car.equals(cooper)){
			String[] coop = new String[3];
			coop[0]="min";
			coop[1]="nissan";
			coop[2]="tiago";
			return Arrays.toString(coop);

		}
		else
		{
			return "not a car";
		}
		


	}

	public static void main(String[] args) {

		CarType c1 = new CarType();
		c1.name = "Honda";
		c1.price = 10;
		c1.color = "white";
		// CarType.wheels = 5;
		c1.stop();
		
		//to call static methods:
		start();   //Directly with the method name
		CarType.start(); //Directly with class.method name

		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 50;
		c2.color = "Red";

		CarType c3 = new CarType();
		c3.name = "BMW";
		c3.price = 60;
		c3.color = "Black";

		// 1. directly:
		System.out.println(wheels);
		// 2. class name:
		System.out.println(CarType.wheels);
		CarType car = new CarType();
		System.out.println(car.arrayList("sedan"));	
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//				if(i==3) {
//					System.out.println("I am a batman");
//				}
//		}

	}

}
