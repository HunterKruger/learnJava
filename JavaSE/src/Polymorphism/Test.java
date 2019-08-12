package Polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal fy=new Dog();
        //向上转型：子类对象转为父类对象，父类引用指向Dog类的具体体现，安全
        fy.intro();
        
        //向下转型：父类对象强制转为子类对象，安全
        Dog fy2=(Dog) fy;
        fy2.intro();
        
        //向下转型2；不安全,Polymorphism.Dog cannot be cast to Polymorphism.Cat
        Cat fy3=(Cat) fy;
        fy3.intro();
	}

}
