package DataStructure.LinkList.SortedLinkedList;

/**
 * Created by FY on 17/1/24.
 */
public class SortedList {
    private Link first;
    public SortedList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insert(int key){
        Link newLink=new Link(key);
        Link previous=null;
        Link current=first;
        while((current!=null)&&(key>current.data)){
            previous=current;
            current=current.next;
        }
        if(previous==null)
            first=newLink;
        else
            previous.next=newLink;
        newLink.next=current;
    }
    public Link remove(){
        Link temp=first;
        first=first.next;
        return first;
    }
    public void displayList(){
        System.out.println("SorterLink:first-->last:");
        Link current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }

}
