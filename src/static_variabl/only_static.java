package static_variabl;


public class only_static {  //class body
	
	static int a=1;
	
	
	public static void main(String[]args) { //main method
		
		System.out.println(a);
		System.out.println("*************************************");
		only_static obj=new only_static();
		obj.m1();
		System.out.println("*************************************");
		Nonstatic kg=new Nonstatic();
		kg.m1();
		
	}
	public void m1() {
		System.out.println(a);
	}
}