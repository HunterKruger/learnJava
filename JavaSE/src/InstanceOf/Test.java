package InstanceOf;

/**
 * Created by FY on 16/12/13.
 */
public class Test {
    public static void doIt(Animal animal){
        if(animal instanceof Dog) {
            ((Dog) animal).intro();
        }
        if(animal instanceof Cat){
            ((Cat) animal).intro();
        }

    }

    public static void main(String[] args) {
        Animal cat=new Cat();
        System.out.println("cat对象属于Animal类吗?"+(cat instanceof Animal));
        System.out.println("cat对象属于Cat类吗?"+(cat instanceof Cat));
        System.out.println("cat对象属于Dog类吗?"+(cat instanceof Dog));
        Animal fy=new Dog();
        System.out.println("fy对象属于Animal类吗?"+(fy instanceof Animal));
        System.out.println("fy对象属于Cat类吗?"+(fy instanceof Cat));
        System.out.println("fy对象属于Dog类吗?"+(fy instanceof Dog));
        Animal fy2=new Cat();
        doIt(fy);
        doIt(fy2);
    }
}
