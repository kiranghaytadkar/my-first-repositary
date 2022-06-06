package array;

import java.util.Arrays;

public class practice {
	
	/*public static void main(String[]args){
		 int array[]={23,546,677,88,89,01000,22,76};

		//min array

		int min=array[0];

		for(int i=0;i<array.length;i++){
		if(array[i]<min){
		min=array[i];
		}
		}
		System.out.println(min);


	}*/
	
	
	public static void main (String[]args){

		int arr[]={23,88,55,3,67,8,99,53,58,54};



		//revers arr

		Arrays.sort(arr);

		for(int i=arr.length-1;i>=0;i--){


		System.out.print(arr[i]+ " ");
		}}





}
