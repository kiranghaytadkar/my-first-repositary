package array;

import java.util.Arrays;

public class revers_array {
	public static void main(String[] args) {
		
	
	
	int arr[]= {12,566,67,99,0,632,234,69};
	System.out.println(arr.length);
	
	
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	System.out.println("revers array");
	for(int j=arr.length-1;   j>=0;  j--) {
		System.out.print(arr[j]+" ");
	}
	
	}
}
