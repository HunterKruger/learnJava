package DataStructure.FromJdk;

import java.util.LinkedList;

/**
 * Created by FY on 16/12/12.
 */
public class LinkedListTest3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //使用数组
        Student student[]=new Student[3];
        student[0]=new Student("Jack",12);
        student[1]=new Student("John",19);
        student[2]=new Student("Jane",20);
        for(int i=0;i<student.length;i++){
            System.out.println("My name is "+student[i].getName()+" and I am "+
                    student[i].getAge()+" years old." );
        }

        System.out.println();

        //使用集合:链表
        Student s1=new Student("Jack",12);
        Student s2=new Student("John",19);
        Student s3=new Student("Jane",20);
        LinkedList<Student> list=new LinkedList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历集合
        for(int i=0;i<list.size();i++){
            Student s=list.get(i);
            System.out.println("My name is "+s.getName()+" and I am "+
                    s.getAge()+" years old." );
        }


    }
}
