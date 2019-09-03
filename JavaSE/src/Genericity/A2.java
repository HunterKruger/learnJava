package Genericity;

public class A2 {
    private String b;

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public A2(String b) {
		super();
		this.b = b;
	}
    public void print(){
    	System.out.println("b的类型为； "+b.getClass().getName());
    }
}
