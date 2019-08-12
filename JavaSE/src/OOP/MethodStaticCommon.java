package OOP;

public class MethodStaticCommon {

	void func1(){
		System.out.println("This is a common method");
	}
	
	static void func2(){
		System.out.println("This is a static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// U使用一般方法:object.method
		MethodStaticCommon Demo=new MethodStaticCommon();
		Demo.func1();
		// 使用静态方法:class.method
		MethodStaticCommon.func2();
		
	}

}
