package OOP;

public class MethodOverload {

	private int a;
	private int b;
	
	public int cir(int a,int b){
		int z=2*(a+b);
		return z;
	}
	
	public double cir(int a){
		double z=2*a*(Math.PI);
		return z;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public MethodOverload() {
		
	}
	

	
	public static void main(String[] args) {
		MethodOverload fy=new MethodOverload();
		System.out.println(fy.cir(3));
		System.out.println(fy.cir(3,4));
		
	}
	
	
}
