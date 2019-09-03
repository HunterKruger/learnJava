package DataStructure.Stack;

/**
 * Created by FY on 16/12/21.
 */
public class StackTest {
    private int top;
    private int maxSize;
    private int[] stackArray;

    public StackTest(int s){
        maxSize=s;
        top=-1;
        stackArray=new int[maxSize];
    }

    public void push(int j){
        stackArray[++top]=j;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){return stackArray[top];}

    public int getTop(){return top;}

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }

    public static void main(String[] args) {
        StackTest stackTest=new StackTest(10);
        stackTest.push(80);
        stackTest.push(60);
        stackTest.push(40);
        stackTest.push(20);
        System.out.println(stackTest.getTop());
        System.out.println(stackTest.peek());

        while(!stackTest.isEmpty()){
            int value=stackTest.pop();
            System.out.print(value+" ");
        }
        System.out.println();

        System.out.println(stackTest.getTop());



    }


}
