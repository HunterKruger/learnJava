package Exception;

public class RuntimeException0 {
	//运行时异常，编译时不检查，可以不用try catch捕获
    public static void testRuntimeException() throws RuntimeException{
    	throw new RuntimeException("运行时异常");
    }
    //异常，编译时检查，必须用try catch捕获
    public static void testException() throws Exception{
    	throw new Exception("异常");
    }
    public static void main(String[] args) {
    	try{
    		testRuntimeException();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	try {
			testException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
