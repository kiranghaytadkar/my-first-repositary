package static_variabl;

public class Nonstatic {//class body
	
	int a =12;
	public static void main(String[]args) {
		
		Nonstatic obj=new Nonstatic();	
		
		System.out.println(obj.a);
		m1(); //direct calling m1 method
	}
	public static void m1() {
		Nonstatic obj=new Nonstatic();	
		System.out.println(obj.a);
	}
}
