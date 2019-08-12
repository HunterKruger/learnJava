package Exception;
public class ExceptingTest {

    public static void main(String[] args) {
        String str1="123";
        String str2="0a";
        try{
	        int a=Integer.parseInt(str1);
	        int b=Integer.parseInt(str2);
	        int c=a/b;
	    }catch(NumberFormatException a){
		    System.out.println("You can only input numbers!");
	    }catch(ArithmeticException e){
		    System.out.println("The divisor cannot be zero");
	    }finally{
	    	System.out.println("Test success!");
	    }
    }
}