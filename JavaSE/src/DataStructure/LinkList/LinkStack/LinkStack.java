package DataStructure.LinkList.LinkStack;

/**
 * Created by FY on 17/1/16.
 */
public class LinkStack {
    private LinkList theList;
    public  LinkStack(){
        theList=new LinkList();
    }
    public void push(int j){
        theList.insertFirst(j);
    }
    public int pop(){
        return theList.deleteFirst();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack(top-->bottom): ");
        theList.displayLinkList();
    }

}
