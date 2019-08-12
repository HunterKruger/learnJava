package OOP;

public class Person3 {
    
	private String name;
	//String class 默认值是 "Null"
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person3(){
		System.out.println("Default constructor!");
	}
	public Person3(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Constructor with arguments!");
	}
	public void say(){
		System.out.println("I'm "+this.getName()+",and I'm "+this.getAge()+" years old.");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person3 Fy=new Person3("Jacky",20);
        Fy.say();
        
        Person3 Fy2=new Person3();
        Fy2.age=12;
        Fy2.name="Hunter";
        Fy2.say();
        
        
	}

}