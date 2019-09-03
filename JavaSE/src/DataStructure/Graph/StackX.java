package DataStructure.Graph;

/**
 * Created by FY on 17/3/15.
 */
public class StackX {
    private final int SIZE=20;
    private int[] stack;
    private int top;
    public StackX(){
        stack=new int[SIZE];
        top=-1;
    }
    public void push(int value){
        stack[++top]=value;
    }
    public int pop(){
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    boolean isEmpty(){
        return (top==-1);
    }
}
