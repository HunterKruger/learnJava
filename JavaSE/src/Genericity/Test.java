package Genericity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A1 a1=new A1(1);
        a1.print();
        int b1=a1.getA();
        System.out.println("b1="+b1);
        
        A2 a2=new A2("Hello");
        a2.print();
        String b2=a2.getB();
        System.out.println("b2="+b2);
        
        //利用多态性
        A3 a3=new A3(2);//向上转型
        a3.print();
        int b3=(Integer) a3.getObject();//向下转型
        System.out.println("b3="+b3);
        //利用多态性
        A3 a4=new A3("Hello again");//向上转型
        a4.print();
        String b4=(String) a4.getObject();//向下转型
        System.out.println("b4="+b4);
        
        //利用泛型
        AA<Integer> aa=new AA<Integer>(3);  //<>内指定泛型的具体类型
        aa.print();
        int b5=aa.getObject();
        System.out.println("b5="+b5);
        //利用泛型
        AA<String> aa2=new AA<String>("It is so easy to use genericity");
        aa2.print();
        String b6=aa2.getObject();
        System.out.println("b6="+b6);
        
        
	}

}