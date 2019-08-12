package DataStructure.LinkList.LinkStack;

/**
 * Created by FY on 17/1/16.
 */
public class LinkList {
    private Link first;
    public LinkList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int data){
        Link newLink=new Link(data);
        newLink.next=first;
        first=newLink;
    }
    public int deleteFirst(){
        Link temp=first;
        first=first.next;
        return temp.data;
    }
    public void  displayLinkList(){
        Link current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }
}
