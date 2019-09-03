package String;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1=("Jacky");// make assignment directly
		String name2=new String ("Jacky");//use new
		String name3=name2;//send references
		//"==" 比较引用
		System.out.println("name1==name2:"+(name1==name2));
		System.out.println("name3==name2:"+(name3==name2));
		System.out.println("name3==name1:"+(name3==name1));
		//equals() 比较内容
		System.out.println("name1.equals(name2):"+(name1.equals(name2)));
		System.out.println("name3.equals(name2):"+(name3.equals(name2)));
		System.out.println("name3.equals(name1):"+(name3.equals(name1))); 
	} 

}
