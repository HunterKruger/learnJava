package DataStructure.LinkList.LinkStack;

/**
 * Created by FY on 17/1/16.
 */
public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack ls=new LinkStack();
        ls.push(13);;
        ls.push(42);
        ls.push(95);
        ls.push(34);
        ls.displayStack();

        System.out.println(ls.pop());

        ls.pop();
        ls.pop();
        ls.pop();
        System.out.println(ls.isEmpty());
        ls.displayStack();
    }
}
