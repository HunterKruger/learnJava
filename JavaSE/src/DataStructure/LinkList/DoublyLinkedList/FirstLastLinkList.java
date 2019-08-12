package DataStructure.LinkList.DoublyLinkedList;

/**
 * Created by FY on 16/12/28.
 */
public class FirstLastLinkList {
    private FirstLastLink first;
    private FirstLastLink last;

    public FirstLastLinkList(){
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        FirstLastLink newFLL=new FirstLastLink(data);
        if(isEmpty())   //如果链表为空
            last=newFLL;  //尾指针指向插入的结点
        //不管链表是否为空,都要执行
        newFLL.next=first;   //新结点的下一个结点是之前头指针指向的结点
        first=newFLL;        //现在头指针指向新结点
    }

    public void insertLast(int data){
        FirstLastLink newFLL=new FirstLastLink(data);
        if(isEmpty())
            first=newFLL;
        else
            last.next=newFLL;
        last=newFLL;
    }

    public int deleteFirst(){
        int temp=first.data;
        if(first.next==null)
            last=null;
        first=first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("FirstLastLink(First>>Last):");
        FirstLastLink current=first;
        while (current!=null){
            current.displayFirstLastLink();
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FirstLastLinkList flll=new FirstLastLinkList();

        flll.insertFirst(32);
        flll.insertFirst(64);
        flll.insertFirst(34);

        flll.insertLast(433);
        flll.insertLast(345);
        flll.insertLast(864);

        flll.displayList();

        flll.deleteFirst();
        flll.deleteFirst();
        flll.displayList();
    }

    
}
