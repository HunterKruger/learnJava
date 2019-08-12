package ThinkingInJava;

/**
 * Created by FY on 2017/5/31.
 */
public class Test1 {

    private int i=0;
    public Test1 increase(){
        i++;
        return this;    //返回自身引用
    }
    public void print(){
        System.out.printf("i="+i);
    }

    public static void main(String[] args) {
        Test1 tt=new Test1();
        tt.increase().increase().increase().print();   //由于increase方法返回自身引用，所以可以在一条语句中对同一对象多次操作
    }

}
