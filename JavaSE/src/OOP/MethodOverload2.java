package OOP;

public class MethodOverload2 {
    static int add(int a,int b){
    	System.out.print("Method 1: ");
    	return a+b;
    }
    static int add(int a,int b,int c){
    	System.out.print("Method 2: ");
    	return a+b+c;
    }
    static int add(int a,String b){
    	System.out.print("Method 3: ");
    	//force type change
    	return a+Integer.parseInt(b);
    }
    
    public static void main(String[] args) {	
		System.out.println(MethodOverload2.add(1,2));
		System.out.println(MethodOverload2.add(1,2,3));
		System.out.println(MethodOverload2.add(1,"3"));
	}
}