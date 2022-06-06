package constructor;

public class car_1 {
	int a;
	String s;
	public car_1() {
		a=1234;
		s="swift";
		System.out.println("default constructor");
	}
	public car_1(int i,String name) {
		a=i;
		s=name;
		
		
	}
	public void m1() {
		System.out.println("the name of the car is "+s);
		System.out.println("the price of the car is "+a);
	}
	public void m2() {
		System.out.println("the name of the car is "+s);
        System.out.println("the price of the car is "+a);
	}

}
