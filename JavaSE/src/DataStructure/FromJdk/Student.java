package DataStructure.FromJdk;

/**
 * Created by FY on 16/12/12.
 */
public class Student {
    private String name;
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
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("My name is "+this.getName()+" and I am "+this.getAge()+" years old.");
    }

    public static void main(String[] args) {
        Student[] stu=new Student[3];
        stu[0]=new Student("dr",2);
        stu[0].print();

    }
}
