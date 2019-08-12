package OOP;

class Student{
	
	private String grade;
	private String name;
	private String category;
	public String getGrade(){
		return grade;
	}
	public String getName(){
		return name;
	}
	public String getCategory(){
		return category;
	}
	public void setGrade(String grade){
		this.grade=grade;
	}	
	public void setName(String name){
		this.name=name;
	}	
	public void setCategory(String category){
		this.category=category;
	}	
    public Student(){
		this.grade="Grade two";
		this.name="Jackyy";
		this.category="Computer science and technology";
	}
	public Student(String grade,String name,String category){
		this.grade=grade;
		this.name=name;
		this.category=category;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Student s1=new Student("Grade three","Jacky","Eletronic and information engineering");
		System.out.println(s1.getGrade()+" "+s1.getName()+" "+s1.getCategory());
		
		Student s2=new Student();
        System.out.println(s2.getGrade()+" "+s2.getName()+" "+s2.getCategory());
         
        Student s3=new Student();
        s3.setCategory("Telecommunication");
        s3.setGrade("Grade one");
        s3.setName("Jackyyy");
        System.out.println(s3.getGrade()+" "+s3.getName()+" "+s3.getCategory());
	}
}


