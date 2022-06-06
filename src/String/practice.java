package String;

public class practice {
	public static void main(String []args){
		int arr[]={34,99,77,32,11,32};
		boolean b=true;
		for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		if(arr[i]==arr[j]){
		System.out.println("found duplicate no :"+arr[i]);
		b=false;
		}
		
		}
		
	}

		if(b==true)	
			System.out.println("no duplicate found");
}
}