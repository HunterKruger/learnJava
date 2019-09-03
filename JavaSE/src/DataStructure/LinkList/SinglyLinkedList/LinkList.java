package DataStructure.LinkList.SinglyLinkedList;

/**
 * Created by FY on 16/12/27.
 */
public class LinkList {

    private Link first;

    public LinkList(){
        first=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int idata,double ddata){
        Link newLink=new Link(idata,ddata);
        newLink.next=first;
        first=newLink;
    }

    public Link deleteFirst(){
        Link temp=first;
        first=temp.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List(first>>last):");
        Link current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }

    public Link find(int key){
        Link temp=first;
        while (temp.idata!=key){
            if(temp.next==null)
                return null;
            else
                temp=temp.next;
        }
        return temp;
    }

    public Link delete(int key){
        Link previous=first;
        Link current=first;
        while (current.idata!=key){
            if(current.next==null)
                return null;
            else {
                previous=current;
                current = current.next;
            }
        }
        if(current==first)   //如果key是第一个结点
            first=first.next;  //删除第一个结点
        else                 //如果key不是第一个结点
            previous.next=current.next;  //删除等于key的结点
        return current;
    }



    public static void main(String[] args) {

        LinkList theList=new LinkList();
        theList.insertFirst(11,11.11);
        theList.insertFirst(22,22.22);
        theList.insertFirst(33,33.33);
        theList.insertFirst(44,44.44);
        theList.insertFirst(55,55.55);

        theList.displayList();

        Link test3=theList.delete(33);
        theList.displayList();

        Link test=theList.find(22);
        if(test!=null)
            System.out.println("Found");
        else
            System.out.println("Not found");

        Link test2=theList.find(10);
        if(test2!=null)
            System.out.println("Found");
        else
            System.out.println("Not found");

        while (!theList.isEmpty()){
            theList.deleteFirst();
        }

        theList.displayList();

    }



}
