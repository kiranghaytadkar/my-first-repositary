package inheritance;

public class son extends father {
	
	
	protected void moblile() {
		System.out.println("mobile-one plus");
	}
	public static void main(String[]args) {
		son abc=new son();
		abc.money();
		abc.home();
	}
	

}
