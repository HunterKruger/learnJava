package Genericity;

public class A1 {
    private Integer a;

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public A1(Integer a) {
		super();
		this.a = a;
	}
	public void print(){
		System.out.println("a的类型为： "+a.getClass().getName());
	}
    
}



