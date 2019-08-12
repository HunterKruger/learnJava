package Exception;

public class Throws {
	
    public static void testThrows() throws NumberFormatException{
    	//当前方法不抛出异常，而是交给方法的调用去处理
    	String str="123a";
    	int a=Integer.parseInt(str);
    	System.out.println(a);
    }
    public static void main(String[] args) {
		try{
			testThrows();
			System.out.println("here"); //不执行
		}catch(Exception e){
			System.out.println("I found exception here!");
			e.printStackTrace();
		}
		System.out.println("I am here.");
		
	}
}
