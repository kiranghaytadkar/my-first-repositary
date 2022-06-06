package array;

public class float_ {
	
	public static void main(String[]args){

		float f[]={23.56f,56.90f,70.96f,46.90f};

		//program for smallest float no

		float min=f[0];

		for(int i=0; i<f.length;i++){
		   if( f[i]<min){
		   min= f[i];
		}
		}
		System.out.println(min);
		}


}
