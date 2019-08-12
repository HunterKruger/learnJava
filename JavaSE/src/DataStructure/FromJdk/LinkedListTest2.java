package DataStructure.FromJdk;
import java.util.LinkedList;

/**
 * Created by FY on 16/12/12.
 */
public class LinkedListTest2 {
    private static void print(LinkedList<String> linkedList){
        System.out.println("当前元素为：");
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Alice");
        linkedList.add("Alan");
        linkedList.add("Amy");
        print(linkedList);

        //返回链表元素的下标，若不存在返回－1
        System.out.println(linkedList.indexOf("Amy"));

        //返回链表的第一个元素，并不删除
        System.out.println(linkedList.peekFirst());

        //返回链表的最后一个元素，并不删除
        System.out.println(linkedList.peekLast());

        //返回链表的第一个元素，并删除
        System.out.println(linkedList.pollFirst());
        print(linkedList);

        //返回链表的最后一个元素，并删除
        System.out.println(linkedList.pollLast());
        print(linkedList);
    }

}
