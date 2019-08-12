package DataStructure.Stack;

/**
 * Created by FY on 16/12/22.
 */
public class StackX {
    private int top;
    private int maxSize;
    private char charArray[];

    public StackX(int s){
        maxSize=s;
        top=-1;
        charArray=new char[s];
    }

    public void push(char c){
        charArray[++top]=c;
    }
    public char pop(){
        return charArray[top--];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }
    public char peek(){
        return charArray[top];
    }

}


