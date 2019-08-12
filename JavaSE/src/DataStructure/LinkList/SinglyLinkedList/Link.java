package DataStructure.LinkList.SinglyLinkedList;

/**
 * Created by FY on 16/12/27.
 */
public class Link {
    public int idata;
    public double ddata;
    public Link next;  //对另外一个link对象的引用

    public Link(int idata,double ddata){
        this.idata=idata;
        this.ddata=ddata;
    }
    public void displayLink(){
        System.out.print("{"+idata+","+ddata+"}");
    }
}
