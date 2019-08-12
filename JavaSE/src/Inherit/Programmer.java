package Inherit;

public class Programmer extends Employer{
    private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

    public void intro(){
		super.intro();
    	System.out.println("I am a "+this.getJob()+" .");
    }

	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programmer(String job,String name, String hobby, int age, double salary) {
		super(name, hobby, age, salary);
		this.job=job;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Programmer fy=new Programmer("programmer","Jacky","guitar",20,90000);
		fy.intro();
	}
    
}
