package constructor;

public class practice_constructor {
	static int a;              //=10000;
	static String s;           //="swift";
	
	public practice_constructor(){
	System.out.println("default constructor");	
		}
	public practice_constructor(int i,String name){
		a=i;
		s=name;
		System.out.println("value of car is "+a);
		System.out.println("name of car is "+s);
		}
	
	
	public static void m1() {
		practice_constructor k=new practice_constructor();
		
		
	System.out.println("mobile no is "+ a);
	System.out.println("name of person is "+ s);
		
	}

}
