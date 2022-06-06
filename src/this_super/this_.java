package this_super;

public class this_ extends this2 {//this word is used for call globle variable of same name of local variable
	int a=100;
	int b=200;
	public static void main(String[]args) {
		this_ t1=new this_();
		t1.m1();
		
		this2 t2=new  this2();
		t2.m2();
		System.out.println(t2.a);
		System.out.println(t2.b);


		
	}
	private  void m1() {
		int a=300;
		int b=400;
		System.out.println("m1 method is running from same class");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
		
	}

}
