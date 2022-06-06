package constructor;

public class constructor {
	
	public constructor() {//zero parameter constructor
		System.out.println("constructor is called ....");
	}
	public constructor (int i) {//one parameter constructor
		System.out.println(i+" one parameter constructor is called....");
	}
	public static void main(String[]args) {
	//	constructor c1= new constructor();
		
	//	constructor c2= new constructor(555555);
		car obj=new car("audi",44000);
		//car obj1=new car();

	}

}
