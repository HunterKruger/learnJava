package CodeBlock;
//静态代码块:在java中使用static关键字声明的代码块。静态块用于初始化类，为类的属性初始化。
//每个静态代码块只会执行一次。由于JVM在加载类时会执行静态代码块，所以静态代码块先于主方法执行。
//如果类中包含多个静态代码块，那么将按照"先定义的代码先执行，后定义的代码后执行"。
//注意：1 静态代码块不能存在于任何方法体内。2 静态代码块不能直接访问静态实例变量和实例方法，需要通过类的实例对象来访问
public class StaticCodeBlock {
	{
		System.out.println("General code block!");
	}
	static{
		System.out.println("Static code block");
	}
	
	public StaticCodeBlock(){
		System.out.println("Constructor1");
	}
	public StaticCodeBlock(int i){
		System.out.println("Constructor2");
	}
	public StaticCodeBlock(int i,int j){
		System.out.println("Constructor3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main method of StaticCodeBlock");
		 new StaticCodeBlock();
         new StaticCodeBlock(1);
         new StaticCodeBlock(1,2);
	}
}
