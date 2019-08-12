package CodeBlock;
//普通代码块：在方法或语句中出现的{}就称为普通代码块。
//普通代码块和一般的语句执行顺序由他们在代码中出现的次序决定--“先出现先执行”
public class CommonCodeBlock {
    int a=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		{
			a=2;
            System.out.println("Common Code Block!");
		}
		System.out.println("a="+a);
	}

}
