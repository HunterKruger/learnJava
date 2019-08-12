package Exception;
public class Division{
	private int a;
	private int b;
	public int divide(){
		return a/b;
	}
	public Division(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class TryCatchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
        	Division div1=new Division(5,0);
            System.out.println(div1.divide());  
        }catch(Exception e){
        	e.printStackTrace();
        	return;
        }finally{
        	System.out.println("finally,ok!");
        }
		System.out.println("ok!");//catch中加了return就不执行
	
    }
}