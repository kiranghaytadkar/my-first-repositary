package array;

public class double_ {
	
	public static void main(String[]args){

		double d[]={23.5678,45.9876,78.98754,43.0987};

		//max no

		double max=d[0];

		for(int i=0;i<d.length;i++){
		if(d[i]>max){
		max=d[i];
		}
		}
		System.out.println("max no is "+max);
		}

}
