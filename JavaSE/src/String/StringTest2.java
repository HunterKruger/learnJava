package String;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化String的两种方法
		
        String name1="Jacky";
        //直接分配:创建的对象会被保存在String对象的内存池里
        //如果已存在不会被再创建
        String name2="Jacky";
                               
        
        String name3=new String ("Jacky");//new对象:每次创建一个对象
        String name4=new String ("Jacky");
        
        System.out.println("name1==name2:"+(name1==name2));
		System.out.println("name3==name4:"+(name3==name4));
		
		//string性质:内容无法改变，只能被指向新的内存地址
		
		String name5="Hunter";
		name5+="Kruger";
		System.out.println(name5);
	}
}
 