package array;

import java.util.Arrays;


public class array2 {
	
	public static void main(String[]args) {
		
		int j[]=new int [5];
		
		j[0]=101;
		j[1]=99;
		j[2]=333;
		j[3]=70;
		j[4]=468;
		
		System.out.println(j.length);
		Arrays.sort(j);
		for(int k=0;k<j.length;k++) {
			System.out.println(j[k]);
		}
}
}
