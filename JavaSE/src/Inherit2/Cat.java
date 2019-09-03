package Inherit2;

public class Cat extends Animal{
   
	//new variable
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	//重写父类的say()方法
	public void say(){
		//call say() from super class
		super.say();
		System.out.println("I am a cat,my name is "+
	                       this.getName()+",I am "+this.getAge()+
	                       " year(s) old,I am from "+this.getAddress()+" .");
	}
	
	//alter+command+s 生成 constructor
	public Cat() {
		super();
		System.out.println("Constructor without parameter from subclass!");
		// TODO Auto-generated constructor stub
	}


	public Cat(String name, int age,String address) {
		super(name, age);
		this.address=address; 
		System.out.println("Constructor with parameters from subclass!");
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat cat=new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        cat.setAddress("Beijing");
        cat.say();
        
        Cat cat2=new Cat("Billy",7,"Shanghai");
        cat2.say();
        
	}

}
