package array;


public class duplicate_array {
	
	public static void main(String[]args) {
		
int arr[]= {200,56,89,67,34,23,11};
boolean b=false;

for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			b=true;
			System.out.println("found duplicate no:"+arr[i]);	
			}
	
		}	

	}
	if(b==false) {
		System.out.println("found no duplicate no");
	}
	
}
}	