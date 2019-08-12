package Inherit;

public class Employer {
    private String name;
    private String hobby;
    private int age;
    private double salary;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employer(String name, String hobby, int age, double salary) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.age = age;
		this.salary = salary;
	}

	public Employer() {
		super();
	}

	public void intro(){
		System.out.println("I am "+this.getName()+" .");
		System.out.println("I am "+this.getAge()+" years old.");
		System.out.println("I like "+this.getHobby()+" .");
		System.out.println("I earn "+this.getSalary()+" dollars each year!");
	}
	
	public static void main(String[] args) {
		Employer em=new Employer("Jack","tennis",23,70000);
		em.intro();
	}
    
}
