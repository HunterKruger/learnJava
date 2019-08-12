package AbstractClass;

public abstract class Shape {
	private int a;
	
	
    public Shape(int a) {
		this.a=a;
	}
    
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public abstract double area();
    public abstract double cir();
    //抽象方法只能定义
  	//但是可以让子类来实现
    
}
