package String;

public class each_word_revers {
	public static void main(String[]args){
		String s="kiran balasaheb ghaytadkar";

		String words[]=s.split(" ");
		String reversestring="";	
		
		for(String w:words) {
			String reversword = "";
		for(int i=w.length()-1;i>=0;i--) {
			reversword=reversword+w.charAt(i);
			}
		reversestring=reversestring+reversword+" ";
		}
		System.out.println(reversestring);
		}
}
