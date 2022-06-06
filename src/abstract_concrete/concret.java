package abstract_concrete;



public class concret extends abstract_{
	
	public static void main(String[] args) {
		
		concret c=new concret();
		
		c.m1();
		c.m2();
		c.m3();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method ");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

}
