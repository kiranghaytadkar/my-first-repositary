package array;

public class largest_no {
	public static void main(String[]args) {
		
		int a[]= {34,67,98,43,23,680,79};
				
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println("largest no is: "+max);
	}
	

}
