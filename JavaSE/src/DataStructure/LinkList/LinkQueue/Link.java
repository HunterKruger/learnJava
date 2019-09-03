package DataStructure.LinkList.LinkQueue;

/**
 * Created by FY on 17/1/19.
 */
public class Link {
    public int data;
    public Link next;
    public Link(int data){
        this.data=data;
    }
    public void displayLink() {
        System.out.print(data + " ");
    }
}
