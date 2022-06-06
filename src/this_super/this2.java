package this_super;

public class this2 {
	int a=500;
	int b=600;
	public static void main(String[]args) {
		this2 obj=new this2();
		obj.m2();
	}
	    protected void m2() {
		int a=700;
		int b=800;
		System.out.println("m2 is running from 2nd class");
		System.out.println(a);
		System.out.println(b);
	}

}
