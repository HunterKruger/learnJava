package AbstractClass;

public class Square extends Shape {
	//所有来自父类的抽象方法必须被重写
	public Square(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		int z=this.getA()*this.getA();
		return z;
	}

	@Override
	public double cir() {
		// TODO Auto-generated method stub
		int z=this.getA()*4;
		return z;
	}
	
	public static void main(String[] args) {
		Square fy2=new Square(3);
		System.out.println(fy2.area());
		System.out.println(fy2.cir());
	}
	
	
    
}