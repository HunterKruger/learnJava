package DataStructure.LinkList.LinkQueue;

/**
 * Created by FY on 17/1/19.
 */
public class FirstLastLink {
    private Link first;
    private Link last;

    public FirstLastLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data) {
        Link newLink = new Link(data);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public int deleteFirst() {
        int temp = last.data;
        if (first.next == null)  //如果只剩一个节点
            last = null;
        first = first.next;
        return temp;
    }

    public void displayList() {
        Link current = first;
        while (current!=null) {
            current.displayLink();
            current = current.next;
        }
        System.out.print(" ");
    }
}