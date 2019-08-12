package OOP;

public class Person {
    //可变参数
	int speak(String name,int age,String ...hobbies){
        System.out.println("I'm "+name+" ,and I'm "+age+" years old.");
		System.out.print("My hobby: ");
		//遍历
		for(String hobby:hobbies){
			System.out.print(hobby+" ");
		}
		int totalHobbies=hobbies.length;
		return totalHobbies;
	}
	
	
	public static void main(String[] args){
		Person Fy=new Person();
		int n=Fy.speak("Jacky", 20, "basketball","guitar");
		System.out.println(".\nThat's enough to have "+n+" hobbies.");
	}
}
