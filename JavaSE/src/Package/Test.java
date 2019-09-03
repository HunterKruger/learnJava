package Package;

/**
 * Created by FY on 16/12/12.
 */
public class Test {
    public static void main(String[] args) {
        String a="1";
        String b="2";
        String c="3a";

        int m=Integer.parseInt(a);
        int n=Integer.parseInt(b);
        System.out.println("a+b="+(m+n));
        try {
            int s=Integer.parseInt(c);//there will be an exception
        }catch(NumberFormatException e){

        }finally{
            System.out.println("无法转型");
        }
    }
}
