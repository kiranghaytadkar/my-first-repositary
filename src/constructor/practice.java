package constructor;

public class practice {
	
	public static void main(String[] args) {
		
		int price_1=12345;
		String name_1="Audi";
		
		car_1 obj_1 = new car_1(price_1,name_1);
		obj_1.m1();
		
		int price_2=10000;
		String name_2="swift";
		car_1 obj_2 = new car_1(price_2,name_2);
		obj_2.m1();
		
		int price_3=123;
		String name_3="hondacity";
		car_1 obj_3 = new car_1(price_3,name_3);
		obj_3.m1();
	}
	

}
