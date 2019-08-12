package Inherit2;

public class Animal {
    
	private String name;
    private int age;
    
    public Animal(){
    	System.out.println("Constructor without parameter from super class!");
    }
    
    public Animal(String name,int age){
    	this.name=name;
    	this.age=age;
    	System.out.println("Constructor with parameters from super class!");
    }
    
    
    //alter+command+s 生成 getters and setters
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
	
	public void say(){
		System.out.println("I am an animal,my name is "+
	                       this.getName()+",I am "+this.getAge()+" year(s) old.");
	}
    
}