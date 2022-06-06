package constructor;
import java.util.Scanner;
public class main {
public static void main(String[]args) {
		
		System.out.println("enter the price of the carr ");
		Scanner sc = new Scanner(System.in);
		int price=sc.nextInt();
		//practice_constructor rv=new practice_constructor();
		//System.out.println(i);
		practice_constructor rv1=new practice_constructor(price,"audi");
		
		//practice_constructor.m1();
		rv1.m1();
		
	}

}

