package static_variabl;

//non static variable call from same class



public class Claas_4 {
	int a=4;
	String b="kiran";
	
	public static void main(String[]args) {
		//obj for class_4
		Claas_4 obj=new Claas_4();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		//creating obj for non static method
		//Claas_4 gg=new Claas_4();
		//gg.m1();
		obj.m1();
	}
	//non static method
	public void m1() {
		System.out.println(a);
		
	}
	
	

}
