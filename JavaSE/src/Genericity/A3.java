package Genericity;

public class A3 {
    private Object object;

	public A3(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
    public void print(){
    	System.out.println("A3的类型为："+object.getClass().getName());
    }
}
