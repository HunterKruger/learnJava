package CodeBlock; 
//构造块：直接在类中定义且没有加static关键字的代码块称为{}构造代码块。
//构造代码块在创建对象时被调用，每次创建对象都会被调用，并且构造代码块的执行次序优先于类构造函数。
public class ConstructorCodeBlock {
	
	public ConstructorCodeBlock(){
		System.out.println("Constructor1");
	}
	public ConstructorCodeBlock(int a){
		System.out.println("Constructor2");
	}
	public ConstructorCodeBlock(int a,int b){
		System.out.println("Constructor3");
	} 
	
	{
		System.out.println("General constructor code block!");
	}
	
	public static void main(String[] args) {
		new ConstructorCodeBlock();//anonymous class
		new ConstructorCodeBlock(1);
		new ConstructorCodeBlock(1,2);
	}
}
 