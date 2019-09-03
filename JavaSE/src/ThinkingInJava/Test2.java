package ThinkingInJava;

/**
 * Created by FY on 2017/5/31.
 */
public class Test2 {

    private int ii;
    private String ss;

    public Test2(int i){
        ii=i;
        System.out.println("Constructor with int only,int="+ii);
    }

    public Test2(String s){
        System.out.println("Constructor with String only,String="+s);
        ss=s;
    }

    public Test2(int i,String ss){
        this(i);
        this.ss=ss;
        System.out.println("Constructor with String and int, String="+this.ss+",int="+this.ii);
    }
    public Test2(){
        this(14,"fy");
        System.out.println("Constructor with no args, String="+this.ss+",int="+this.ii);
    }

    public static void main(String[] args) {
        Test2 a=new Test2(3);
        Test2 b=new Test2("jack");
        Test2 c=new Test2();
        Test2 d=new Test2(23,"tom");
    }


}
