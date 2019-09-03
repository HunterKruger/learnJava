package String;

public class StringTest {
    public static void main(String[] args) {
		char ch1[]={'a','b','c','d','e'};
		String str1=new String(ch1);
		System.out.println(str1);
		
		String str2=new String(ch1,0,3);
		System.out.println(str2);
		
		String str3=new String(str1);
		System.out.println(str3);
	    System.out.println(str3==str1);
	    System.out.println(str3.equals(str1));
	    
	    for(int i=0;i<str1.length();i++){
	    	char ch2=str1.charAt(i);
	    	System.out.print(ch2);
	    }
	    System.out.println();
	    
	    String str4="";
	    System.out.println(str4.isEmpty());
	    
	    String str5="Who is your daddy?"; 
	    System.out.println(str5.substring(12));
	    System.out.println(str5.substring(12, 17));
	    System.out.println(str5.toUpperCase());
	    System.out.println(str5.toLowerCase());
	    
	    String str6=str5.concat(" Jacky!");
	    System.out.println(str6);
	    
	    String str7="corn";
	    str7.replace('c', 'p');
	    System.out.println(str7);
	    System.out.println(str7.replace('c', 'p'));
	    
	    String str8="abcdedcba";
	    System.out.println(str8.indexOf('a'));
	    System.out.println(str8.indexOf('a',5));
	    System.out.println(str8.lastIndexOf('a'));
	    
	    
		
		
	}
}