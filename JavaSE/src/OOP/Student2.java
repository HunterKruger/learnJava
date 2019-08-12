package OOP;

public class Student2 {
    private int age;
    private String name;
    private int height;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Student2(int age, String name, int height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}
	public Student2() {
		
	}
	public void say(){
		System.out.println("I am "+this.getName()+" .");
		System.out.println("I am "+this.getHeight()+"cm tall.");
		System.out.println("I am "+this.getAge()+" years old.");
		
	}
	
	public static void main(String[] args) {
		Student2 fy=new Student2();
		fy.setAge(11);
		fy.setHeight(180);
		fy.setName("Jack");
		fy.say();
		Student2 fy2=new Student2(99,"Nanny",160);
		fy2.say();
		
	}
    
}
