package String;

public class duplicate_string {
	public static void main(String[]args) {
		
		String[] s= {"kiran","yogesh","laukik","sandip","chetan","laukik"};
		
		boolean b=true;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]) {
					System.out.println("duplicate String found :"+s[i]);
					b=false;
				}
			}
		}
		if(b==true) {
			System.out.println("no duplicate string found");
		}
	}

}
