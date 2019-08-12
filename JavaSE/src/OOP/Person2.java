package OOP;

class Tricir{
	int chest;
	int waist;
	int bust;
}

public class Person2 {
    
    void speak(int age,Tricir t){
    	System.out.println("I'm "+age+" years old."
    			+ "My three circumference is: "+t.chest+" "+t.waist+" "+t.bust);
    	age=20;
    	t.chest=80;
    }
    
    public static void main(String[] args) {
		Person2 Yzl=new Person2();
		int age=21;
		Tricir triCir=new Tricir();
		triCir.chest=90;
		triCir.waist=60;
		triCir.bust=80;
		Yzl.speak(age,triCir);
		System.out.println(age);
		System.out.println(triCir.chest);
		
	}
}
