package Interface;

public class Individual implements Jobs,House{

	@Override
	public void intro2() {
		// TODO Auto-generated method stub
		System.out.println("My house is located in Shanghai!");
		System.out.println("It costs me "+House.value+" dollars!");
	}

	@Override
	public void intro() {
		// TODO Auto-generated method stub
		System.out.println("I am a driver!");
		System.out.println("I earn "+Jobs.salary+" dollars every month!");
	}
	public static void main(String[] args) {
		System.out.println(Jobs.now);
		Individual fy=new Individual();
		fy.intro();
		System.out.println(House.now2);
		fy.intro2();
		
	}
	
}
