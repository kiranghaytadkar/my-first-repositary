package array;

import java.util.Arrays;

public class revers {
	public static void main(String[]args){
		int arr[]={12,34,566,77,33};

		Arrays.sort(arr);
			
		for(int i=arr.length-1;i>=0;i--){
	    System.out.print(" "+arr[i]);
		}
		}

}
