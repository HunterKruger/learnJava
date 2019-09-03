package Package;

/**
 * Created by FY on 16/12/12.
 */
public class Manual {
    public static void main(String[] args) {
        int a=1;
        Integer i=new Integer(a); //装箱:把基本变量转换成对象变量
        int b=i.intValue(); //拆箱：把对象变量转换成基本变量
        System.out.println("a="+a);
        System.out.println("i="+i);
        System.out.println("b="+b);
    }
}
