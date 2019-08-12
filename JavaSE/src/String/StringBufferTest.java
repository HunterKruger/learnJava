package String;

public class StringBufferTest {

	    public static void main(String[] args) {
	    	//对String类型的对象操作，等同于重新生成一个对象，然后将应用指向它
	    	//对StringBuffer类型的对象操作，操作的始终是一个对象
			String str="abcd";
			StringBuffer sf=new StringBuffer(str);
			System.out.println(sf);
			sf.append("efgh");
			System.out.println(sf);
			sf.append('i');
			System.out.println(sf);
			sf.delete(0, 3);
			System.out.println(sf);
			sf.deleteCharAt(0);
			System.out.println(sf);
			System.out.println(sf.capacity());
			
		}
	}

