package OOP;

public class StaticMethod {
    public static void say(){
    	System.out.println("Hello");
    }
    public void say2(){
    	System.out.println("Hello again");
    }
    public static void main(String[] args) {
    	StaticMethod.say();
    	StaticMethod fy=new StaticMethod();
    	fy.say2();
	}
}
