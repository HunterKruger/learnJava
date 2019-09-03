package Exception;

public class CustomException extends Exception {
    public CustomException(String message){
    	super(message);
    }
    public static void test() throws CustomException{
		throw new CustomException("自定义异常");
	}
	public static void main(String[] args) {
		try {
			test();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

