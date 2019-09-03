package AbstractClass;


public class Round extends Shape{
	//所有来自父类的抽象方法必须被重写
	public Round(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cir() {
		// TODO Auto-generated method stub
		double z=2*this.getA()*3.14;
		return z;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double z=3.14*this.getA()*this.getA();
		return z;
	}
	
	public static void main(String[] args) {
		Round fy=new Round(5);
		System.out.println(fy.area());
		System.out.println(fy.cir());
	}
	
}
