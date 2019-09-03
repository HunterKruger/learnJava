package DataStructure.LinkList.LinkQueue;

/**
 * Created by FY on 17/1/19.
 */
public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue lq=new LinkQueue();
        lq.insert(45);
        lq.insert(63);
        lq.insert(95);
        lq.insert(34);

        lq.displayQueue();

        lq.remove();
        lq.remove();
        lq.remove();

        lq.displayQueue();

        lq.remove();
        System.out.println(lq.isEmpty());
    }
}
