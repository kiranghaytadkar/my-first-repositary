package String;

public class method {
	public static void main(String[] args) {
		
		// 1. charAt - It returns char values for particular index
	               	// 0 1 2 3 4 5 6 7
			String s1= "Selenium";
			System.out.println(s1.charAt(3));  // e
			System.out.println(s1.charAt(6)); //u
		//	System.out.println(s1.charAt(10));
		//	String s2 =" Selenium Automation";
		//	System.out.println(s2.charAt(9));

		// 2. Length() - It returns string length/size.
			
			String s2 ="Velocity";
			System.out.println(s2.length());
			
			
	   //String s3="Velocity Classes";
	   //System.out.println(s3.length());
		  
		// 3. equal - it checks the equality of string with the given object.
			
			String s4 ="Velocity";
			String s5 ="Velocity";
		   System.out.println("*********************");
		    System.out.println(s4.equals(s5)); // true
		    
		 //4. equals ignorecase -  it compares another string. it dosen't check case.
		    String s6 ="JAVA";
		    String s7 ="java";
		    System.out.println(s6.equalsIgnoreCase(s7));  // True
		    
		 //5. Is empty -to check weather the string is empty or not
		    String s8="";
		    String s9=" ";
		    System.out.println(s8.isEmpty());// True
		    System.out.println(s9.isEmpty());  // false
		    
		 //6.Replace  - it replace all occurances of the specified charsequence
		    
		    String s10 ="06-04-2022";
		    System.out.println(s10.replace("-", "/"));
		    
		    String s11="Java_Classes";
		    System.out.println(s11.replace("J", "k"));
		    
		 //7. Substring  -- it returns substring for given begin index
		    String s12 ="Velocity  Classes";
		    System.out.println(s12.substring(1, 3));
		    
		 //8. indexofchar --it return the index of the first occurrence of a specified text in a string.
		    String s13="kiran balasaheb";
		    System.out.println(s13.indexOf("a"));
		    //index of 2nd and 3rd occurance of a text in a string
		    System.out.println(s13.indexOf("a",+s13.indexOf("a", +1) +1));
		    System.out.println(s13.indexOf("a",s13.indexOf("a",+s13.indexOf("a", +1) +1) +1));
		    
	    //9. lastindexof char
		    System.out.println(s13.lastIndexOf("a"));
		    
		    
		//10.replace all
		    
		    String s14="helllo i m kiran ";
		    System.out.println(s14.replaceAll(" ", ""));
		    
		    //11..to UpperCase
		    System.out.println(s14.toUpperCase());
		    
		    //12..to LowerCase
		    
		    System.out.println(s14.toLowerCase());
		    
		    //13..Trim -It removes beginning and ending spaces of this string.
	    	String s15="   Good Evening  "; 
	    	System.out.println(s15.trim());
	    	
	    	//14.. split  -It returns a split string matching regex.
	    	
	    	String s16="Hello_world_Test_java";
	    String s17[]=s16.split("_");
	    for (int i=0;i<s17.length;i++) {
	    	System.out.println(s17[i]+" ");
	    	
	    	//15.concat - It concatenates the specified string.

	    	 String x="Hello";
	    	 String y="World";
	    	 System.out.println(x.concat("d"));  // Hellod
	    	 
	    	 int a=10;
	    	 int b=20;
	    	 System.out.println(x+y);
	    	 System.out.println(a+b);   //30
	    	 System.out.println(x+y+a+b); //Helloworld30,1020
	    	 System.out.println(a+b+x+y);
	    	 System.out.println(x+y+(a+b));
	    	 
	    	
	    }
		}
		}
