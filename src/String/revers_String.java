package String;

public class revers_String {
	
	public static void main(String[] args) {
		String s="hello good morning";
	
		String b="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			b+=s.charAt(i);
		}
		
		System.out.println(b);
}
}	