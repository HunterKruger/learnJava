package Genericity;

public class AA<T>{
    private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public AA(T object) {
		super();
		this.object = object;
	}
    public void print(){
    	System.out.println("T的类型为："+object.getClass().getName());
    }
}
