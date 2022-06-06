package String;

public class replace {
	
	public static void main(String[]args) {
		
		String s1="kiran b h";
		
		System.out.println(s1.replace("h", "g"));
		
		System.out.println(s1.substring(2,6));
		
		String s2="kiran";
		String s3="kiran";
		
		System.out.println(s2.equals(s3));//true
		
		String s4="KIRAN";
		String s5="kiran";

		System.out.println(s4.equalsIgnoreCase(s5));//true

	}

}
