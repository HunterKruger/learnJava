package DataStructure.LinkList.SortedLinkedList;

/**
 * Created by FY on 17/1/24.
 */
public class SortedListApp {
    public static void main(String[] args) {
        SortedList sl=new SortedList();
        sl.insert(20);
        sl.insert(40);
        sl.displayList();

        sl.insert(10);
        sl.insert(30);
        sl.insert(50);
        sl.displayList();

        sl.remove();
        sl.displayList();
    }
}
