package array;

public class smallest_no {
	public static void main(String[]args) {
		
	
	
		
	int a[]= {77,55,43,87,44,68,78,11,-66};
	
	int min=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("min value is "+min);	

}
}